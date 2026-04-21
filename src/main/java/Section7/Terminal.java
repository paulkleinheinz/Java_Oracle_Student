package Section7;

public class Terminal {

    private PrizeCategory prize1;
    private PrizeCategory prize2;
    private PrizeCategory prize3;

    public Terminal(PrizeCategory prize1, PrizeCategory prize2, PrizeCategory prize3) {
        this.prize1 = prize1;
        this.prize2 = prize2;
        this.prize3 = prize3;
    }

    // Convert money (whole dollars) to credits on a card: 2 credits per $1
    public void loadCredits(Card card, int dollars) {
        int newCredits = dollars * 2;
        card.setCreditBalance(card.getCreditBalance() + newCredits);
        System.out.println("[Terminal] Loaded " + newCredits + " credits onto Card #"
                + card.getCardNumber() + " for $" + dollars
                + ". New balance: " + card.getCreditBalance() + " credits.");
    }

    // Print both balances of a card
    public void checkBalance(Card card) {
        System.out.println("[Terminal] Card #" + card.getCardNumber()
                + " | Credits: " + card.getCreditBalance()
                + " | Tickets: " + card.getTicketBalance());
    }

    // Transfer credits from one card to another (amount <= 0 means all)
    public void transferCredits(Card from, Card to, int amount) {
        int available = from.getCreditBalance();
        if (amount <= 0 || amount > available) {
            amount = available;
        }
        from.setCreditBalance(from.getCreditBalance() - amount);
        to.setCreditBalance(to.getCreditBalance() + amount);
        System.out.println("[Terminal] Transferred " + amount + " credit(s) from Card #"
                + from.getCardNumber() + " to Card #" + to.getCardNumber() + ".");
        checkBalance(from);
        checkBalance(to);
    }

    // Transfer tickets from one card to another (amount <= 0 means all)
    public void transferTickets(Card from, Card to, int amount) {
        int available = from.getTicketBalance();
        if (amount <= 0 || amount > available) {
            amount = available;
        }
        from.setTicketBalance(from.getTicketBalance() - amount);
        to.setTicketBalance(to.getTicketBalance() + amount);
        System.out.println("[Terminal] Transferred " + amount + " ticket(s) from Card #"
                + from.getCardNumber() + " to Card #" + to.getCardNumber() + ".");
        checkBalance(from);
        checkBalance(to);
    }

    // Redeem tickets for a prize (prizeNumber: 1, 2 or 3)
    public void redeemPrize(Card card, int prizeNumber) {
        PrizeCategory prize = getPrize(prizeNumber);
        if (prize == null) {
            System.out.println("[Terminal] Invalid prize selection.");
            return;
        }

        if (prize.getCount() <= 0) {
            System.out.println("[Terminal] Sorry, \"" + prize.getName()
                    + "\" is out of stock!");
            return;
        }

        if (card.getTicketBalance() < prize.getTicketsRequired()) {
            System.out.println("[Terminal] Card #" + card.getCardNumber()
                    + " has insufficient tickets for \"" + prize.getName()
                    + "\". (Has: " + card.getTicketBalance()
                    + ", needs: " + prize.getTicketsRequired() + ")");
            checkBalance(card);
            return;
        }

        // Deduct tickets and award prize
        card.setTicketBalance(card.getTicketBalance() - prize.getTicketsRequired());
        prize.setCount(prize.getCount() - 1);

        System.out.println("[Terminal] Card #" + card.getCardNumber()
                + " redeemed \"" + prize.getName() + "\"! "
                + prize.getCount() + " remaining in terminal.");
        checkBalance(card);
    }

    private PrizeCategory getPrize(int prizeNumber) {
        switch (prizeNumber) {
            case 1: return prize1;
            case 2: return prize2;
            case 3: return prize3;
            default: return null;
        }
    }
}

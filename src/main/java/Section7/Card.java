package Section7;

public class Card {

    private static int nextCardNumber = 1;

    private int cardNumber;
    private int creditBalance;
    private int ticketBalance;

    public Card() {
        this.cardNumber = nextCardNumber++;
        this.creditBalance = 0;
        this.ticketBalance = 0;
    }

    // Getters
    public int getCardNumber() {
        return cardNumber;
    }

    public int getCreditBalance() {
        return creditBalance;
    }

    public int getTicketBalance() {
        return ticketBalance;
    }

    // Setters (no validation – cards have zero computing power)
    public void setCreditBalance(int creditBalance) {
        this.creditBalance = creditBalance;
    }

    public void setTicketBalance(int ticketBalance) {
        this.ticketBalance = ticketBalance;
    }
}

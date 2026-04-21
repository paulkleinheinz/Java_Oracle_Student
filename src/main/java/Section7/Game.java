package Section7;

import java.util.Random;

public class Game {

    private String name;
    private int creditsRequired;
    private Random random;

    public Game(String name, int creditsRequired) {
        this.name = name;
        this.creditsRequired = creditsRequired;
        this.random = new Random();
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getCreditsRequired() {
        return creditsRequired;
    }

    // Swipe a card to play the game
    public void swipe(Card card) {
        if (card.getCreditBalance() < creditsRequired) {
            System.out.println("[" + name + "] Card #" + card.getCardNumber()
                    + " has insufficient credits to play. (Balance: "
                    + card.getCreditBalance() + " credits, required: " + creditsRequired + ")");
            return;
        }

        // Subtract credits
        card.setCreditBalance(card.getCreditBalance() - creditsRequired);

        // Award random non-negative number of tickets (0–10)
        int ticketsWon = random.nextInt(11);
        card.setTicketBalance(card.getTicketBalance() + ticketsWon);

        System.out.println("[" + name + "] Card #" + card.getCardNumber()
                + " won " + ticketsWon + " ticket(s)! "
                + "Total tickets: " + card.getTicketBalance()
                + " | Credits remaining: " + card.getCreditBalance());
    }
}

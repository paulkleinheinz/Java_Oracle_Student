package Section7;

public class ArcadeTest {

    public static void main(String[] args) {

        // --- Setup ---
        PrizeCategory smallPrize  = new PrizeCategory("Sticker Pack",   5,  10);
        PrizeCategory mediumPrize = new PrizeCategory("Plush Toy",      20,  5);
        PrizeCategory bigPrize    = new PrizeCategory("Giant Teddy Bear",50,  2);

        Terminal terminal = new Terminal(smallPrize, mediumPrize, bigPrize);

        Game winRandomTickets = new Game("Win Random Tickets Game!", 3);
        Game racingGame       = new Game("Racing Game",              5);

        Card card1 = new Card();
        Card card2 = new Card();

        System.out.println("=== Loading Credits ===");
        terminal.loadCredits(card1, 10);   // 20 credits
        terminal.loadCredits(card2, 15);   // 30 credits

        System.out.println("\n=== Playing Games with Card 1 ===");
        winRandomTickets.swipe(card1);
        winRandomTickets.swipe(card1);
        racingGame.swipe(card1);
        winRandomTickets.swipe(card1);
        racingGame.swipe(card1);

        System.out.println("\n=== Playing Games with Card 2 ===");
        winRandomTickets.swipe(card2);
        racingGame.swipe(card2);
        winRandomTickets.swipe(card2);
        winRandomTickets.swipe(card2);
        racingGame.swipe(card2);
        winRandomTickets.swipe(card2);

        System.out.println("\n=== Balances before Transfer ===");
        terminal.checkBalance(card1);
        terminal.checkBalance(card2);

        System.out.println("\n=== Transfer ALL Credits and Tickets from Card 1 to Card 2 ===");
        terminal.transferCredits(card1, card2, 0);   // 0 = transfer all
        terminal.transferTickets(card1, card2, 0);   // 0 = transfer all

        System.out.println("\n=== Redeeming Prizes with Card 2 ===");
        terminal.redeemPrize(card2, 1);   // Sticker Pack (5 tickets)
        terminal.redeemPrize(card2, 2);   // Plush Toy    (20 tickets)
        terminal.redeemPrize(card2, 3);   // Giant Teddy  (50 tickets)

        System.out.println("\n=== Try to Play and Redeem with Card 1 (should fail) ===");
        winRandomTickets.swipe(card1);    // Card 1 has 0 credits -> insufficient
        terminal.redeemPrize(card1, 1);  // Card 1 has 0 tickets -> insufficient

        System.out.println("\n=== Try to Redeem out-of-stock prize ===");
        // Give card2 enough tickets and try to redeem Giant Teddy twice (only 2 in stock)
        terminal.loadCredits(card2, 5);
        for (int i = 0; i < 3; i++) {
            winRandomTickets.swipe(card2);
        }
        terminal.redeemPrize(card2, 3);
        terminal.redeemPrize(card2, 3);  // Should now be out of stock
        terminal.redeemPrize(card2, 3);  // Error: out of stock

        System.out.println("\n=== Final Balances ===");
        terminal.checkBalance(card1);
        terminal.checkBalance(card2);
    }
}

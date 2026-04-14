package Section6;

import java.util.Scanner;

public class ValidatePin {

    public static void main(String[] args) {
        int validPin = 1234;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your PIN: ");
        int enteredPin = scanner.nextInt();

        while (enteredPin != validPin) {
            System.out.println("Incorrect PIN. Please try again.");
            System.out.print("Enter your PIN: ");
            enteredPin = scanner.nextInt();
        }

        System.out.println("Correct PIN entered. You now have access to your account.");
    }
}

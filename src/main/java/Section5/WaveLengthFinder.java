package Section5;

import java.util.Scanner;

public class WaveLengthFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a wavelength (or 'exit' to quit):");
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("exit")) break;
            try {
                double input = Double.parseDouble(line);
                System.out.println(waveLengthFinder(input));
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }

    }

   public static String waveLengthFinder(double input){


   if (input >= 380 && input <= 750){


           if (input >= 380 && input <= 450) {
               return "Violet";
           }
           if (input >= 450 && input <= 495) {
               return "Blue";
           }
           if (input >= 495 && input <= 570) {
               return "Green";
           }
           if (input >= 570 && input <= 590) {
               return "Yellow";
           }
           if (input >= 590 && input <= 620) {
               return "Orange";
           }
           if (input >= 620 && input <= 750) {
               return "Red";
           }

       } else {
           return "The entered wavelength is not a part of the visible spectrum";
       }
       return "The entered wavelength is not a part of the visible spectrum";
    }
}


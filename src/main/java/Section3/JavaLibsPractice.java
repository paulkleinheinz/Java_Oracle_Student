package Section3;

import java.util.Scanner;

public class JavaLibsPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dein Name: ");
        String name = scanner.nextLine();

        System.out.print("Ein Adjektiv: ");
        String adjective = scanner.nextLine();

        System.out.print("Ein Tier: ");
        String animal = scanner.nextLine();

        System.out.print("Ein Verb (Grundform): ");
        String verb = scanner.nextLine();

        System.out.print("Eine Stadt: ");
        String city = scanner.nextLine();

        System.out.print("Ein Essen: ");
        String food = scanner.nextLine();

        System.out.print("Ein Beruf: ");
        String job = scanner.nextLine();

        System.out.print("Mehrzahl von " + animal + ": ");
        String animalPlural = scanner.nextLine();

        System.out.print("Wie viele " + animalPlural + " hast du? ");
        int count = Integer.parseInt(scanner.nextLine());

        System.out.print("Wie alt bist du? ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Wie gross bist du? (in Meter, z.B. 1.75): ");
        double height = Double.parseDouble(scanner.nextLine());

        int doubleCount = count * 2;
        int nextYear = age + 1;
        double heightInCm = height * 100;

        System.out.println();
        System.out.println(name + " ist ein " + adjective + "er " + job + " aus " + city + ".");
        System.out.println("Er hat " + count + " " + animalPlural + ". Morgen bekommt er noch mal so viele,");
        System.out.println("dann hat er " + doubleCount + " " + animalPlural + "!");
        System.out.println("Sein Lieblingsessen ist " + food + " und er liebt es zu " + verb + "en.");
        System.out.println("Er ist " + age + " Jahre alt. Naechstes Jahr wird er " + nextYear + ".");
        System.out.println("Seine Groesse betraegt " + height + " m, also " + heightInCm + " cm.");
    }
}

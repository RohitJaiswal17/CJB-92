package Practise.decisionmaking.switchcase;

import java.util.Scanner;

public class LanguageSelectorProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a language:");
        System.out.println("1. English");
        System.out.println("2. French");
        System.out.println("3. Spanish");
        System.out.print("Enter your choice (1-3): ");
        int choice = scanner.nextInt();

        String greeting;

        switch (choice) {
            case 1:
                greeting = "Hello!";
                break;
            case 2:
                greeting = "Bonjour!";
                break;
            case 3:
                greeting = "¡Hola!";
                break;
            default:
                greeting = "Invalid choice";
        }

        System.out.println("Greeting: " + greeting);

        scanner.close();
    }
}
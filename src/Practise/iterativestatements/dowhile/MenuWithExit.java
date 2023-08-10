package Practise.iterativestatements.dowhile;

import java.util.Scanner;

public class MenuWithExit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Option 1");
            System.out.println("2. Option 2");
            System.out.println("3. Option 3");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You selected Option 1.");
                    // Perform action for Option 1
                    break;
                case 2:
                    System.out.println("You selected Option 2.");
                    // Perform action for Option 2
                    break;
                case 3:
                    System.out.println("You selected Option 3.");
                    // Perform action for Option 3
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }

            System.out.println(); // Empty line for separation

        } while (choice != 4);

        scanner.close();
    }
}

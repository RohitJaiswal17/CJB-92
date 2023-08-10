package Practise.iterativestatements.dowhile;

import java.util.Scanner;

public class PasswordCheckerProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String correctPassword = "secret"; // Change this to your desired password

        String enteredPassword;

        do {
            System.out.print("Enter the password: ");
            enteredPassword = scanner.next();

            if (enteredPassword.equals(correctPassword)) {
                System.out.println("Password is correct. Access granted.");
                break;
            } else {
                System.out.println("Incorrect password. Please try again.");
            }
        } while (true);

        scanner.close();
    }
}

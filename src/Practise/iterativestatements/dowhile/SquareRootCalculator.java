package Practise.iterativestatements.dowhile;

import java.util.Scanner;

public class SquareRootCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        double number = scanner.nextDouble();

        if (number <= 0) {
            System.out.println("Invalid input. Please enter a positive number.");
        } else {
            double guess = number / 2; // Initial guess
            double epsilon = 1e-6; // Small value to check convergence
            double newGuess;

            do {
                newGuess = 0.5 * (guess + number / guess); // Newton-Raphson formula
                if (Math.abs(newGuess - guess) < epsilon) {
                    break; // Convergence achieved
                }
                guess = newGuess;
            } while (true);

            System.out.println("Square root of " + number + " is approximately: " + newGuess);
        }

        scanner.close();
    }
}

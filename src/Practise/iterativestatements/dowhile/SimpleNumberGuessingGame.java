package Practise.iterativestatements.dowhile;

import java.util.Scanner;

public class SimpleNumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int targetNumber = 42; // You can set the target number to any desired value
        int userGuess;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100.");

        do {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            if (userGuess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number " + targetNumber + " correctly!");
                hasGuessedCorrectly = true;
            }
        } while (!hasGuessedCorrectly);

        scanner.close();
    }
}

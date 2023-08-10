package Practise.iterativestatements.whileloops;

import java.util.Scanner;

public class SimpleNumberGuessingGameNoRandom {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int secretNumber = 42; // You can choose any number as the secret number
		int attempts = 0;

		System.out.println("Welcome to the Number Guessing Game!");

		while (true) {
			System.out.print("Guess a number: ");
			int guess = scanner.nextInt();
			attempts++;

			if (guess < secretNumber) {
				System.out.println("Too low. Try again.");
			} else if (guess > secretNumber) {
				System.out.println("Too high. Try again.");
			} else {
				System.out.println(
						"Congratulations! You guessed the number " + secretNumber + " in " + attempts + " attempts.");
				break;
			}
		}

		scanner.close();
	}
}
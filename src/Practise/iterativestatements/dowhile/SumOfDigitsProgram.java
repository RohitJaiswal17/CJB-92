package Practise.iterativestatements.dowhile;

import java.util.Scanner;

public class SumOfDigitsProgram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a positive integer: ");
		int number = scanner.nextInt();

		if (number < 0) {
			System.out.println("Invalid input. Please enter a non-negative integer.");
		} else {
			int originalNumber = number;
			int sum = 0;

			do {
				int digit = number % 10;
				sum += digit;
				number /= 10;
			} while (number > 0);

			System.out.println("Sum of digits of " + originalNumber + " is: " + sum);
		}

		scanner.close();
	}
}

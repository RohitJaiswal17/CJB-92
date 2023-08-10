package Practise.iterativestatements.dowhile;

import java.util.Scanner;

public class FactorialCalculatorProgram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a positive integer: ");
		int number = scanner.nextInt();

		if (number < 0) {
			System.out.println("Invalid input. Please enter a non-negative integer.");
		} else {
			int factorial = 1;
			int i = 1;

			do {
				factorial *= i;
				i++;
			} while (i <= number);

			System.out.println("Factorial of " + number + " is: " + factorial);
		}

		scanner.close();
	}
}

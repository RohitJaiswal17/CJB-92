package Practise.iterativestatements.whileloops;

import java.util.Scanner;

public class FactorFinderProgram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a positive integer: ");
		int number = scanner.nextInt();

		if (number <= 0) {
			System.out.println("Invalid input. Please enter a positive integer.");
		} else {
			System.out.println("Factors of " + number + ":");

			int factor = 1;
			while (factor <= number) {
				if (number % factor == 0) {
					System.out.print(factor + " ");
				}
				factor++;
			}
		}

		scanner.close();
	}
}

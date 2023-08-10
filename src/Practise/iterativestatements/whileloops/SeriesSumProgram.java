package Practise.iterativestatements.whileloops;

import java.util.Scanner;

public class SeriesSumProgram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a positive integer n: ");
		int n = scanner.nextInt();

		if (n <= 0) {
			System.out.println("Invalid input. Please enter a positive integer.");
		} else {
			double sum = 0;
			int i = 1;

			while (i <= n) {
				sum += 1.0 / i;
				i++;
			}

			System.out.println("Sum of the series 1 + 1/2 + 1/3 + ... + 1/" + n + " is: " + sum);
		}

		scanner.close();
	}
}

package Practise.iterativestatements.whileloops;

import java.util.Scanner;

public class MultiplicationTableProgram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int number = scanner.nextInt();

		int multiplier = 1;

		System.out.println("Multiplication Table for " + number + ":");

		while (multiplier <= 10) {
			int product = number * multiplier;
			System.out.println(number + " * " + multiplier + " = " + product);
			multiplier++;
		}

		scanner.close();
	}
}
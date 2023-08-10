package Practise.iterativestatements.whileloops;

import java.util.Scanner;

public class TableOfPowersProgram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the base number: ");
		int base = scanner.nextInt();

		System.out.print("Enter the limit: ");
		int limit = scanner.nextInt();

		int exponent = 1;

		System.out.println("Table of Powers for " + base + ":");
		System.out.println("Exponent \t Result");

		while (exponent <= limit) {
			int result = (int) Math.pow(base, exponent);
			System.out.println(exponent + "\t\t " + result);
			exponent++;
		}

		scanner.close();
	}
}

package Practise.iterativestatements.forloops;

import java.util.Scanner;

public class TableOfPowers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = scanner.nextInt();

		System.out.println("Table of Powers for " + number + ":");
		for (int i = 1; i <= 5; i++) {
			long power = 1;
			for (int j = 1; j <= i; j++) {
				power *= number;
			}
			System.out.println(number + " ^ " + i + " = " + power);
		}

		scanner.close();
	}

}

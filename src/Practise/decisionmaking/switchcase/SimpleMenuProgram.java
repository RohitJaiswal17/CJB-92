package Practise.decisionmaking.switchcase;

import java.util.Scanner;

public class SimpleMenuProgram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Menu:");
		System.out.println("1. Print");
		System.out.println("2. Save");
		System.out.println("3. Exit");
		System.out.print("Enter your choice (1-3): ");
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Printing...");
			break;
		case 2:
			System.out.println("Saving...");
			break;
		case 3:
			System.out.println("Exiting the program.");
			break;
		default:
			System.out.println("Invalid choice. Please select a valid option.");
		}

		scanner.close();
	}

}

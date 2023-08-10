package Practise.decisionmaking.switchcase;

import java.util.Scanner;

public class SeasonIdentifierProgram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Select a season:");
		System.out.println("1. Spring");
		System.out.println("2. Summer");
		System.out.println("3. Fall");
		System.out.println("4. Winter");
		System.out.print("Enter your choice (1-4): ");
		int choice = scanner.nextInt();

		String season;

		switch (choice) {
		case 1:
			season = "Spring";
			break;
		case 2:
			season = "Summer";
			break;
		case 3:
			season = "Fall";
			break;
		case 4:
			season = "Winter";
			break;
		default:
			season = "Invalid choice";
		}

		System.out.println("Corresponding season: " + season);

		scanner.close();
	}
}
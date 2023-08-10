package Practise.decisionmaking.switchcase;

import java.util.Scanner;

public class DayOfWeekProgram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter an integer (1-7) representing a day of the week: ");
		int dayNumber = scanner.nextInt();

		String day;

		switch (dayNumber) {
		case 1:
			day = "Sunday";
			break;
		case 2:
			day = "Monday";
			break;
		case 3:
			day = "Tuesday";
			break;
		case 4:
			day = "Wednesday";
			break;
		case 5:
			day = "Thursday";
			break;
		case 6:
			day = "Friday";
			break;
		case 7:
			day = "Saturday";
			break;
		default:
			day = "Invalid day number";
		}

		System.out.println("Corresponding day: " + day);

		scanner.close();
	}
}
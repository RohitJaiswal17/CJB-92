package Practise.decisionmaking.switchcase;

import java.util.Scanner;

public class ColorMixerProgram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Primary Colors:");
		System.out.println("1. Red");
		System.out.println("2. Blue");
		System.out.println("3. Yellow");

		System.out.print("Enter the first primary color (1-3): ");
		int color1 = scanner.nextInt();

		System.out.print("Enter the second primary color (1-3): ");
		int color2 = scanner.nextInt();

		String mixedColor;

		switch (color1) {
		case 1:
			switch (color2) {
			case 1:
				mixedColor = "Red";
				break;
			case 2:
				mixedColor = "Purple";
				break;
			case 3:
				mixedColor = "Orange";
				break;
			default:
				mixedColor = "Invalid combination";
			}
			break;
		case 2:
			switch (color2) {
			case 1:
				mixedColor = "Purple";
				break;
			case 2:
				mixedColor = "Blue";
				break;
			case 3:
				mixedColor = "Green";
				break;
			default:
				mixedColor = "Invalid combination";
			}
			break;
		case 3:
			switch (color2) {
			case 1:
				mixedColor = "Orange";
				break;
			case 2:
				mixedColor = "Green";
				break;
			case 3:
				mixedColor = "Yellow";
				break;
			default:
				mixedColor = "Invalid combination";
			}
			break;
		default:
			mixedColor = "Invalid combination";
		}

		System.out.println("Mixed color: " + mixedColor);

		scanner.close();
	}
}
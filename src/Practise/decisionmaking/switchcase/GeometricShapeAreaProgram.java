package Practise.decisionmaking.switchcase;

import java.util.Scanner;

public class GeometricShapeAreaProgram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Select a geometric shape:");
		System.out.println("1. Circle");
		System.out.println("2. Square");
		System.out.println("3. Triangle");
		System.out.print("Enter your choice (1-3): ");
		int choice = scanner.nextInt();

		double area;

		switch (choice) {
		case 1:
			System.out.print("Enter the radius of the circle: ");
			double radius = scanner.nextDouble();
			area = Math.PI * radius * radius;
			break;
		case 2:
			System.out.print("Enter the side length of the square: ");
			double sideLength = scanner.nextDouble();
			area = sideLength * sideLength;
			break;
		case 3:
			System.out.print("Enter the base length of the triangle: ");
			double base = scanner.nextDouble();
			System.out.print("Enter the height of the triangle: ");
			double height = scanner.nextDouble();
			area = 0.5 * base * height;
			break;
		default:
			System.out.println("Invalid choice. Please select a valid option.");
			scanner.close();
			return;
		}

		System.out.println("Area of the selected shape: " + area);

		scanner.close();
	}
}
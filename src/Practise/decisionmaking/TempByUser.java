package Practise.decisionmaking;

import java.util.Scanner;

public class TempByUser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Temperature Converter");
		System.out.println("1. Celsius to Fahrenheit");
		System.out.println("2. Fahrenheit to Celsius");
		System.out.print("Enter your choice (1 or 2): ");
		int choice = sc.nextInt();

		double temperature;

		if (choice == 1) {
			System.out.print("Enter temperature in Celsius: ");
			temperature = sc.nextDouble();
			double convertedTemperature = (temperature * 9 / 5) + 32;
			System.out.println("Temperature in Fahrenheit: " + convertedTemperature + " F");
		} else if (choice == 2) {
			System.out.print("Enter temperature in Fahrenheit: ");
			temperature = sc.nextDouble();
			double convertedTemperature = (temperature - 32) * 5 / 9;
			System.out.println("Temperature in Celsius: " + convertedTemperature + " C");
		} else {
			System.out.println("Invalid choice.");
		}

		sc.close();
	}

}

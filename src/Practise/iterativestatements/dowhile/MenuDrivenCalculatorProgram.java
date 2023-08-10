package Practise.iterativestatements.dowhile;

import java.util.Scanner;

public class MenuDrivenCalculatorProgram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char choice;

		do {
			System.out.println("Menu:");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Exit");
			System.out.print("Enter your choice (1-5): ");
			choice = scanner.next().charAt(0);

			if (choice >= '1' && choice <= '4') {
				System.out.print("Enter first operand: ");
				double operand1 = scanner.nextDouble();
				System.out.print("Enter second operand: ");
				double operand2 = scanner.nextDouble();

				double result = 0;

				switch (choice) {
				case '1':
					result = operand1 + operand2;
					break;
				case '2':
					result = operand1 - operand2;
					break;
				case '3':
					result = operand1 * operand2;
					break;
				case '4':
					if (operand2 != 0) {
						result = operand1 / operand2;
					} else {
						System.out.println("Division by zero is not allowed.");
						continue;
					}
					break;
				}

				System.out.println("Result: " + result);
			} else if (choice != '5') {
				System.out.println("Invalid choice. Please select a valid option.");
			}
		} while (choice != '5');

		System.out.println("Calculator program has exited.");

		scanner.close();
	}
}

package Practise.decisionmaking.switchcase;

import java.util.Scanner;

public class SimpleATMProgram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double accountBalance = 1000.0; // Initial account balance

		while (true) {
			System.out.println("ATM Menu:");
			System.out.println("1. Check Balance");
			System.out.println("2. Withdraw Money");
			System.out.println("3. Deposit Money");
			System.out.println("4. Exit");
			System.out.print("Enter your choice (1-4): ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Account Balance: $" + accountBalance);
				break;
			case 2:
				System.out.print("Enter the amount to withdraw: $");
				double withdrawAmount = scanner.nextDouble();
				if (withdrawAmount <= accountBalance) {
					accountBalance -= withdrawAmount;
					System.out.println("Withdrawal successful. New balance: $" + accountBalance);
				} else {
					System.out.println("Insufficient funds.");
				}
				break;
			case 3:
				System.out.print("Enter the amount to deposit: $");
				double depositAmount = scanner.nextDouble();
				if (depositAmount > 0) {
					accountBalance += depositAmount;
					System.out.println("Deposit successful. New balance: $" + accountBalance);
				} else {
					System.out.println("Invalid deposit amount.");
				}
				break;
			case 4:
				System.out.println("Exiting the ATM. Thank you!");
				scanner.close();
				return;
			default:
				System.out.println("Invalid choice. Please select a valid option.");
			}
		}
	}
}
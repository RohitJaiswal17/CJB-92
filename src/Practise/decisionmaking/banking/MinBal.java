package Practise.decisionmaking.banking;

import java.util.Scanner;

public class MinBal {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your account balance: ");
		double accountBalance = sc.nextDouble();

		if (accountBalance >= 1000) {
			System.out.println("Your account has maintained the minimum balance.");
		} else {
			System.out.println("Your account has not maintained the minimum balance.");
		}

		sc.close();
	}
}

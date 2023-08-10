package Practise.decisionmaking.banking;

import java.util.Scanner;

public class AccountStatus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your account balance: ");
        double accountBalance = sc.nextDouble();
        
        if (accountBalance > 0) {
            System.out.println("Account is in credit.");
        } else if (accountBalance < 0) {
            System.out.println("Account is in overdraft.");
        } else {
            System.out.println("Account balance is zero.");
        }
        
        sc.close();
	}

}

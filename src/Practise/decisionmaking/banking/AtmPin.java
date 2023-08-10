package Practise.decisionmaking.banking;

import java.util.Scanner;

public class AtmPin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int correctPIN = 1234;
        
		System.out.print("Enter your ATM PIN: ");
        int enteredPIN = sc.nextInt();
        
        
        if (enteredPIN == correctPIN) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied.");
        }
        
        sc.close();
	}

}

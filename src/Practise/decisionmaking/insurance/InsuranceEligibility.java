package Practise.decisionmaking.insurance;

import java.util.Scanner;

public class InsuranceEligibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        if (age >= 18 && age <= 60) {
            System.out.println("You are eligible for insurance.");
        } else {
            System.out.println("You are not eligible for insurance.");
        }
        
        sc.close();
	}

}

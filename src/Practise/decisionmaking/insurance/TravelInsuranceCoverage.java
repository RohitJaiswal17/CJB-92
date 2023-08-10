package Practise.decisionmaking.insurance;

import java.util.Scanner;

public class TravelInsuranceCoverage {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your destination: ");
		String destination = sc.nextLine().toLowerCase();

		int coverageAmount;

		if (destination.equals("europe")) {
			coverageAmount = 500000; // Rs. 500,000
			System.out.println("Coverage amount: Rs. " + coverageAmount);
			} 
		
		else if (destination.equals("asia")) {
			coverageAmount = 300000; // Rs. 300,000
			System.out.println("Coverage amount: Rs. " + coverageAmount);
			} 
		
		else {
			System.out.println("Invalid destination.");

			}

	

		sc.close();
	}

}

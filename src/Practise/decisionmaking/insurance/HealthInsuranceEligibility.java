package Practise.decisionmaking.insurance;

import java.util.Scanner;

public class HealthInsuranceEligibility {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your age: ");
		int age = sc.nextInt();

		System.out.print("Enter your health condition (excellent/poor): ");
		String healthCondition = sc.next().toLowerCase();

		if (age >= 18 && age <= 60 && healthCondition.equals("excellent")) {
			System.out.println("You are eligible for health insurance.");
		} else {
			System.out.println("You are not eligible for health insurance.");
		}

		sc.close();
	}

}

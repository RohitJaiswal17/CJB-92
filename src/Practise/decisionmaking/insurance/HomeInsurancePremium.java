package Practise.decisionmaking.insurance;

import java.util.Scanner;

public class HomeInsurancePremium {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter home type (apartment/bungalow): ");
        String homeType = sc.nextLine().toLowerCase();

        System.out.print("Enter home value: ");
        double homeValue = sc.nextDouble();

        double premium = 0;

        if (homeType.equals("apartment")) {
            premium = 0.02 * homeValue; // 2% of home value
        } else if (homeType.equals("bungalow")) {
            premium = 0.04 * homeValue; // 4% of home value
        } else {
            System.out.println("Invalid home type.");
            
        }

        System.out.println("Insurance premium: Rs. " + premium);

        sc.close();

	}

}

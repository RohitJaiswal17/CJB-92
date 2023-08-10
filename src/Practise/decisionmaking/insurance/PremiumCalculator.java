package Practise.decisionmaking.insurance;

import java.util.Scanner;

public class PremiumCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter vehicle type (car/bike): ");
        String vehicleType = sc.nextLine().toLowerCase();

        System.out.print("Enter vehicle age (in years): ");
        int vehicleAge = sc.nextInt();

        int premium = 0;

        if (vehicleType.equals("car")) {
            if (vehicleAge <= 5) {
                premium = 8000;
            } else {
                premium = 6000;
            }
        } else if (vehicleType.equals("bike")) {
            if (vehicleAge <= 3) {
                premium = 3000;
            } else {
                premium = 2000;
            }
        } else {
            System.out.println("Invalid vehicle type.");
            
        }

        System.out.println("Insurance premium: Rs. " + premium);

        sc.close();
	}

}

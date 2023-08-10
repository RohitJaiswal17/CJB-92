package Practise.decisionmaking.insurance;

import java.util.Scanner;

public class InsuranceP {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter person's age: ");
        int age = scanner.nextInt();

        System.out.println("Enter person's health condition (excellent/poor): ");
        String healthCondition = scanner.next();

        System.out.println("Enter person's location (city/village): ");
        String location = scanner.next();

        System.out.println("Enter person's gender (male/female): ");
        String gender = scanner.next();

        int premium = 0;
        int policyAmount = 0;

        if (healthCondition.equals("excellent") && age >= 25 && age <= 35 && location.equals("city") && gender.equals("male")) {
            premium = 4;
            policyAmount = 200000;
        } else if (healthCondition.equals("excellent") && age >= 25 && age <= 35 && location.equals("city") && gender.equals("female")) {
            premium = 3;
            policyAmount = 100000;
        } else if (healthCondition.equals("poor") && age >= 25 && age <= 35 && location.equals("village") && gender.equals("male")) {
            premium = 6;
            policyAmount = 10000;
        } else {
            System.out.println("Sorry, the provided conditions do not match any premium calculations.");
            System.exit(0);
        }

        int calculatedPremium = premium * policyAmount / 1000;
        System.out.println("Premium amount: Rs. " + calculatedPremium);
    }
}

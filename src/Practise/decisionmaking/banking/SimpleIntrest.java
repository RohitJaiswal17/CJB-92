package Practise.decisionmaking.banking;

import java.util.Scanner;

public class SimpleIntrest {

    public static void main(String[] args) {
        double principal, roi, time, si;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the principal amount: ");
        principal = sc.nextDouble();

        System.out.println("Enter the rate of interest (in percentage): ");
        roi = sc.nextDouble();

        System.out.println("Enter the time period (in years): ");
        time = sc.nextDouble();

        sc.close();

        si = (principal * roi * time) / 100;

        System.out.println("Simple Interest: " + si);
    }
}

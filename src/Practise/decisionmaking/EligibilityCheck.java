package Practise.decisionmaking;

import java.util.Scanner;

public class EligibilityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your gender (M/F): ");
        char gender = scanner.next().charAt(0);

        if (age >= 18) {
            System.out.println("You are eligible for voting.");
        } else {
            System.out.println("You are not eligible for voting.");
        }

        if (gender == 'M' || gender == 'm') {
            if (age >= 65) {
                System.out.println("You are eligible for retirement benefits.");
            } else {
                System.out.println("You are not eligible for retirement benefits.");
            }
        } else if (gender == 'F' || gender == 'f') {
            if (age >= 60) {
                System.out.println("You are eligible for retirement benefits.");
            } else {
                System.out.println("You are not eligible for retirement benefits.");
            }
        } else {
            System.out.println("Invalid gender input.");
        }

        if (age >= 18 && age<=60) {
            System.out.println("You are eligible for driving.");
        } else {
            System.out.println("You are not eligible for driving.");
        }
    }
}
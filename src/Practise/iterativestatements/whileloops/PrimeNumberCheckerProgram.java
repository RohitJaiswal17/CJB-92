package Practise.iterativestatements.whileloops;

import java.util.Scanner;

public class PrimeNumberCheckerProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println("Invalid input. Please enter a positive integer greater than 1.");
        } else {
            boolean isPrime = true;
            int divisor = 2;

            while (divisor <= number / 2) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
                divisor++;
            }

            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }

        scanner.close();
    }
}

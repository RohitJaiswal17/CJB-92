package Practise.iterativestatements.whileloops;

import java.util.Scanner;

public class PowerCalculatorProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int base = scanner.nextInt();

        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        int result = 1;
        int count = 0;

        while (count < exponent) {
            result *= base;
            count++;
        }

        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        scanner.close();
    }
}

package Practise.iterativestatements.whileloops;

import java.util.Scanner;

public class DecimalToBinaryConverterProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();

        if (decimalNumber < 0) {
            System.out.println("Invalid input. Please enter a non-negative decimal number.");
        } else if (decimalNumber == 0) {
            System.out.println("Binary representation: 0");
        } else {
            StringBuilder binaryRepresentation = new StringBuilder();

            while (decimalNumber > 0) {
                int remainder = decimalNumber % 2;
                binaryRepresentation.insert(0, remainder);
                decimalNumber /= 2;
            }

            System.out.println("Binary representation: " + binaryRepresentation);
        }

        scanner.close();
    }
}


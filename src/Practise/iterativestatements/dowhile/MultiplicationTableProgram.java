package Practise.iterativestatements.dowhile;

import java.util.Scanner;

public class MultiplicationTableProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        System.out.println("Multiplication Table for " + number + ":");
        
        int multiplier = 1;

        do {
            int product = number * multiplier;
            System.out.println(number + " * " + multiplier + " = " + product);
            multiplier++;
        } while (multiplier <= 10);

        scanner.close();
    }
}

package Practise.iterativestatements.dowhile;

import java.util.Scanner;

public class SeriesSumDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        double sum = 0.0;
        int i = 1;

        do {
            System.out.print("Enter a positive integer n: ");
            n = scanner.nextInt();
        } while (n <= 0);

        do {
            sum += 1.0 / i;
            i++;
        } while (i <= n);

        System.out.println("Sum of the series 1 + 1/2 + 1/3 + ... + 1/" + n + " is: " + sum);

        scanner.close();
    }
}

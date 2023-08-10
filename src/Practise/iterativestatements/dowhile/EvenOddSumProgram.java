package Practise.iterativestatements.dowhile;

import java.util.Scanner;

public class EvenOddSumProgram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the starting number: ");
		int start = scanner.nextInt();

		System.out.print("Enter the ending number: ");
		int end = scanner.nextInt();

		int evenSum = 0;
		int oddSum = 0;
		int currentNumber = start;

		do {
			if (currentNumber % 2 == 0) {
				evenSum += currentNumber;
			} else {
				oddSum += currentNumber;
			}
			currentNumber++;
		} while (currentNumber <= end);

		System.out.println("Sum of even numbers: " + evenSum);
		System.out.println("Sum of odd numbers: " + oddSum);

		scanner.close();
	}
}

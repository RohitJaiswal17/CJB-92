package Practise.iterativestatements.whileloops;

import java.util.Scanner;

public class SimpleFibonacciSequenceProgram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the value of n: ");
		int n = scanner.nextInt();

		int first = 0, second = 1;

		System.out.println("Fibonacci Sequence:");

		int count = 0;
		while (count < n) {
			System.out.print(first + " ");

			int next = first + second;
			first = second;
			second = next;

			count++;
		}

		scanner.close();
	}
}
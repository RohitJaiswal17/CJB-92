package Practise.iterativestatements.forloops;

public class SumOfFirstNNumbers {

	public static void main(String[] args) {
		int n = 10; // Number of natural numbers to sum
		int sum = 0; // Initialize the sum

		for (int i = 1; i <= n; i++) {
			sum += i; // Add the current number to the sum
		}

		System.out.println("Sum of the first " + n + " natural numbers is: " + sum);

	}

}

package Practise.iterativestatements.foreachloops;

public class SumOfArrayElements {

	public static void main(String[] args) {
		int[] numbers = { 5, 10, 15, 20, 25 };

		int sum = 0; // Initialize a variable to store the sum

		for (int num : numbers) {
			sum += num; // Add the current element to the sum
		}

		System.out.println("Sum of array elements: " + sum);
	}

}

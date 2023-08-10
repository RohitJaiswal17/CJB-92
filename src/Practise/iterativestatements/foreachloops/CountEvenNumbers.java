package Practise.iterativestatements.foreachloops;

public class CountEvenNumbers {

	public static void main(String[] args) {
		int[] numbers = { 4, 9, 12, 7, 18, 21, 16, 5 };

		int evenCount = 0; // Initialize a variable to count even numbers

		for (int num : numbers) {
			if (num % 2 == 0) {
				evenCount++;
			}
		}

		System.out.println("Number of even numbers: " + evenCount);

	}

}

package Practise.iterativestatements.foreachloops;

public class FindMaximumValue {

	public static void main(String[] args) {
		int[] numbers = { 15, 8, 23, 19, 42, 30 };

		int max = Integer.MIN_VALUE; // Initialize max to smallest possible value

		for (int num : numbers) {
			if (num > max) {
				max = num;
			}
		}

		System.out.println("Maximum value: " + max);

	}

}

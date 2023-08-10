package Practise.iterativestatements.foreachloops;

public class ReverseArray {

	public static void main(String[] args) {
		int[] numbers = { 5, 10, 15, 20, 25 };

		int length = numbers.length;
		int[] reversedNumbers = new int[length];

		for (int i = 0; i < length; i++) {
			reversedNumbers[i] = numbers[length - 1 - i];
		}

		System.out.println("Original array:");
		for (int num : numbers) {
			System.out.print(num + " ");
		}

		System.out.println("\nReversed array:");
		for (int num : reversedNumbers) {
			System.out.print(num + " ");
		}
	}

}

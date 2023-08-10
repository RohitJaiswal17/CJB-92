package Practise.iterativestatements.foreachloops;

public class SquareArrayElements {

	public static void main(String[] args) {
		int[] numbers = { 2, 5, 8, 10, 3 };

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = numbers[i] * numbers[i];
		}

		System.out.println("Squared array elements:");
		for (int num : numbers) {
			System.out.println(num);
		}
	}

}

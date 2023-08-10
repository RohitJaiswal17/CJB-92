package Practise.iterativestatements.foreachloops;

public class PrintArrayElements {

	public static void main(String[] args) {
		int[] numbers = { 5, 10, 15, 20, 25 };

		System.out.println("Array elements:");
		for (int num : numbers) {
			System.out.println(num);
		}
	}

}

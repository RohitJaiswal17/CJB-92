package Practise.iterativestatements.foreachloops;

public class FindMinimumValue {

	public static void main(String[] args) {
		double[] numbers = { 15.5, 8.2, 23.7, 19.0, 42.9, 30.1 };

		double min = Double.MAX_VALUE; // Initialize min to largest possible value

		for (double num : numbers) {
			if (num < min) {
				min = num;
			}
		}

		System.out.println("Minimum value: " + min);

	}

}

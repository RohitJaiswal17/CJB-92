package Practise.iterativestatements.forloops;

public class OddNumbers {

	public static void main(String[] args) {
		int start = 30; // Starting point
		int end = 50; // Ending point

		System.out.println("Odd numbers between " + start + " and " + end + ":");

		for (int i = start; i <= end; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

}

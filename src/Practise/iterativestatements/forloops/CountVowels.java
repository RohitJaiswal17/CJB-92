package Practise.iterativestatements.forloops;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();
		scanner.close();

		int vowelCount = 0; // Initialize the vowel count

		for (int i = 0; i < input.length(); i++) {
			char ch = Character.toLowerCase(input.charAt(i)); // Convert character to lowercase
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelCount++;
			}
		}

		System.out.println("Number of vowels in the input string: " + vowelCount);

	}

}

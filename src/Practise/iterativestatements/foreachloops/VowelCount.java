package Practise.iterativestatements.foreachloops;

public class VowelCount {

	public static void main(String[] args) {
		String[] words = { "apple", "banana", "cherry", "date", "elderberry" };

		for (String word : words) {
			int vowelCount = 0; // Initialize vowel count for each word

			for (char c : word.toLowerCase().toCharArray()) {
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					vowelCount++;
				}
			}

			System.out.println("Number of vowels in '" + word + "': " + vowelCount);
		}

	}

}

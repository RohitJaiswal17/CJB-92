package Practise.iterativestatements.foreachloops;

public class UppercaseConverter {

	public static void main(String[] args) {
		String[] words = { "apple", "banana", "cherry", "date", "elderberry" };

		for (int i = 0; i < words.length; i++) {
			words[i] = words[i].toUpperCase();
		}

		System.out.println("Uppercase words:");
		for (String word : words) {
			System.out.println(word);
		}
	}

}

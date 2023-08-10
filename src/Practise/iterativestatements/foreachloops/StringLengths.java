package Practise.iterativestatements.foreachloops;

public class StringLengths {

	public static void main(String[] args) {
		String[] words = { "apple", "banana", "cherry", "date", "elderberry" };

		for (String word : words) {
			int length = word.length();
			System.out.println("Length of '" + word + "': " + length);
		}
	}

}

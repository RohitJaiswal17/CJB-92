package Practise.iterativestatements.foreachloops;

public class ReverseStringArray {

	public static void main(String[] args) {
		String[] words = { "apple", "banana", "cherry", "date", "elderberry" };

		// Iterate through the array in reverse order and print each string
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.println(words[i]);
		}

	}

}

package Practise.iterativestatements.foreachloops;

public class ConcatenateStrings {

	public static void main(String[] args) {
		String[] words = { "Hello", " ", "world", "!", " ", "Java", " ", "programming" };

		StringBuilder concatenatedString = new StringBuilder();

		for (String word : words) {
			concatenatedString.append(word);
		}

		String result = concatenatedString.toString();
		System.out.println(result);

	}

}

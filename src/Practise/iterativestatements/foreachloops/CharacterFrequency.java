package Practise.iterativestatements.foreachloops;

public class CharacterFrequency {

	public static void main(String[] args) {
		String input = "programming";

		int[] charFrequency = new int[256]; // Array to store character frequencies

		for (char c : input.toCharArray()) {
			charFrequency[c]++;
		}

		System.out.println("Character frequencies:");
		for (int i = 0; i < charFrequency.length; i++) {
			if (charFrequency[i] > 0) {
				System.out.println((char) i + ": " + charFrequency[i]);
			}
		}
	}

}

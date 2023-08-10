package Practise.iterativestatements.whileloops;

public class PrintAlphabetsProgram {
	public static void main(String[] args) {
		char currentChar = 'a';

		System.out.println("Lowercase English Alphabets:");

		while (currentChar <= 'z') {
			System.out.print(currentChar + " ");
			currentChar++;
		}
	}
}

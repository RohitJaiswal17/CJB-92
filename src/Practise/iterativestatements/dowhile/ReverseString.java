package Practise.iterativestatements.dowhile;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String input = scanner.nextLine();
		String reversed = "";

		int length = input.length();
		int index = length - 1;

		do {
			reversed += input.charAt(index);
			index--;
		} while (index >= 0);

		System.out.println("Reversed string: " + reversed);

		scanner.close();
	}
}

package Practise.iterativestatements.dowhile;

import java.util.Scanner;

public class PalindromeCheckerProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Remove spaces and convert to lowercase for case-insensitive comparison
        String cleanedInput = input.replaceAll("\\s", "").toLowerCase();

        int left = 0;
        int right = cleanedInput.length() - 1;
        boolean isPalindrome = true;

        do {
            if (cleanedInput.charAt(left) != cleanedInput.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        } while (left < right);

        if (isPalindrome) {
            System.out.println("'" + input + "' is a palindrome.");
        } else {
            System.out.println("'" + input + "' is not a palindrome.");
        }

        scanner.close();
    }
}

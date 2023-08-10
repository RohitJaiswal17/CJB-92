package Practise.iterativestatements.dowhile;

public class PrintAlphabets {
    public static void main(String[] args) {
        char currentChar = 'a';

        do {
            System.out.print(currentChar + " ");
            currentChar++;
        } while (currentChar <= 'z');

        System.out.println(); // Print a newline for formatting
    }
}

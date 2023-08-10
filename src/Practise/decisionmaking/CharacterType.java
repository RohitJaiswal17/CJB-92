package Practise.decisionmaking;

import java.util.Scanner;

public class CharacterType {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a character: ");
		
		char ch=sc.next().charAt(0);
		
		if(Character.isUpperCase(ch))
		{
			System.out.println("Upper Case");
		}
		else if(Character.isLowerCase(ch))
		{
			System.out.println("Lower Case");
		}
		else if(Character.isDigit(ch))
		{
			System.out.println("Digit");
		}
		else
		{
			System.out.println("Symbol");
		}
	}

}

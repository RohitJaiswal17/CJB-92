package Practise.decisionmaking;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int number=sc.nextInt();
		
		if(number%2==0)
		{
			System.out.println("Given value is Even Number");
		}
		else
		{
			System.out.println("Given value is odd number");
		}
	}

}

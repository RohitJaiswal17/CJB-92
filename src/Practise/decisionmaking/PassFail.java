package Practise.decisionmaking;

import java.util.Scanner;

public class PassFail {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Marks : ");
		int marks=sc.nextInt();
		
		if(marks>=50)
		{
			System.out.println("Student has Passed exam");
		}
		else
		{
			System.out.println("Student has Failed exam");
		}
		
		
	}

}

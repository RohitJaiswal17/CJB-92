package Practise.decisionmaking;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter Grades : ");
			
			int grade=sc.nextInt();
			
			if(grade>=90 && grade<=100)
			{
				System.out.println("A grade");
			}
			else if (grade>=80 && grade<=89)
			{
				System.out.println("B grade");
			}
			else if (grade>=70 && grade<=79)
			{
				System.out.println("C grade");
			}
			else if (grade>=60 && grade<=69)
			{
				System.out.println("D grade");
			}
			else if(grade>=0 && grade<=59)
			{
				System.out.println("F grade");
			}
			else
			{
				System.out.println("Invalid Input");
			}
	}

}

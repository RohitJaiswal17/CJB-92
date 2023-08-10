package Practise.decisionmaking.switchcase;

import java.util.Scanner;

public class CoffeeVendingMachine {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		
		switch(choice) {
		
		case 1: 
			System.out.println("Dispensing cold coffee");
			break;	
		case 2:
			System.out.println("Dispensing hot coffee");
			break;
		case 3:
			System.out.println("Dispensing cappuccino");
			break;
		case 4:
			System.out.println("Dispensing Espresso");
		
			break;
		case 5:
			System.out.println("Dispensing Latte");
			break;
		default:
			System.out.println("Invalid Input");
		}
	}

}

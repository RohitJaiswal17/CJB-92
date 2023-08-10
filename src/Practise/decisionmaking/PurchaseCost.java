package Practise.decisionmaking;

import java.util.Scanner;

public class PurchaseCost {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the quantity : ");
		int quantity=sc.nextInt();
		System.out.println("Enter the price per item : ");
		double item=sc.nextDouble();
		
		double totalcost = quantity*item;
		
		if(totalcost>1000)
		{
			totalcost=totalcost-(0.10*totalcost);   				//totalcost -= 0.10 * totalcost;
			System.out.println("Total cost : " + totalcost);
		}
		else if(totalcost>500)
		{
			totalcost=totalcost-(0.05*totalcost);
			System.out.println("Total cost : " + totalcost);
		}
		
		else
		{
			System.out.println("Total cost : " + totalcost);
		}
	}

}

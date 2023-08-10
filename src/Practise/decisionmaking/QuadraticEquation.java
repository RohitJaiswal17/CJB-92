package Practise.decisionmaking;

import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		
		double r1,r2;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a, b, c value: ");						//descriminate d=(b*b)-(4*a*c)
																			// d can be 0, >0, <0
			double a=sc.nextDouble();										//d=0 (real & equal)
			double b=sc.nextDouble();										//d>0 (real and distinct)
			double c=sc.nextDouble();										//d<0 (real and imaginary)
			
			double  d=(b*b)-(4*a*c);
			
			if(d==0)
			{
				System.out.println("Roots are real and equal");
				r1=r2= -b/(2*a);
				System.out.println("R1 = " +r1);
				System.out.println("R2 = " +r2);
			}
			else if(d>0)
			{
				System.out.println("Roots are real and distinct");
				r1=(-b + Math.sqrt(d))/(2*a);
				r2=(-b - Math.sqrt(d))/(2*a);
				System.out.println("R1 = " +r1);
				System.out.println("R2 = " +r2);
			}
			else
			{
				System.out.println("Roots are distinct and imaginary");
				
				double x= -b/(2*a);
				double y= Math.sqrt(-d)/(2*a);
				
				System.out.println("R1=" + x + "+i" + y);
			}
			
	}

}

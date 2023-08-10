package Practise.decisionmaking.switchcase;

import java.util.Scanner;

public class ColorMixture {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Primary Colours are : Red, Yello, Green");
		
		System.out.println("Please Enter first Primary color : ");
		String color1=sc.nextLine();
		
		System.out.println("Please Enter Second Primary color : ");
		String color2=sc.nextLine();
		
		String mixture = mixColors(color1,color2);
		System.out.println("Mixture of : " + color1 +" " +"and" + " "+color2 + " "+"is" +" "+ mixture);
		
	}
	
	public static String mixColors(String color1, String color2) {
		switch(color1.toLowerCase() + color2.toLowerCase())
		{
			case "redblue":
			case "bluered":
				return "purple";
					
			case "redyellow":
			case "yellored":
				return "orange";
					
			case "yellowblue":
			case "blueyellow":
				return "orange";	
				
			default:
				return "Invalid";
		}
	}

}

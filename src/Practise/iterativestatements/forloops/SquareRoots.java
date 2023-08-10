package Practise.iterativestatements.forloops;

public class SquareRoots {
	public static void main(String[] args) {
		for (int num = 1; num <= 5; num++) {
			double squareRoot = Math.sqrt(num);
			System.out.println("The square root of " + num + " is " + squareRoot);
		}
	}
}


// this line of code:

//Math is the class that provides various mathematical functions and constants in Java.
//sqrt() is a static method of the Math class, which calculates the square root of the argument passed to it.
//num is the number for which you want to calculate the square root.
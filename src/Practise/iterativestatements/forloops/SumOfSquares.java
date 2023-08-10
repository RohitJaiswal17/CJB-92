package Practise.iterativestatements.forloops;

public class SumOfSquares {

	public static void main(String[] args) {
		 int n = 5; // The upper limit for the loop
	        int sum = 0; // Initialize the sum
	        
	        for (int i = 1; i <= n; i++) {
	            int square = i * i; // Calculate the square of the current number
	            sum += square; // Add the square to the sum
	        }
	        
	        System.out.println("Sum of squares from 1 to " + n + " is: " + sum);
  	}

}

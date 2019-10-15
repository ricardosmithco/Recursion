package helloworld;

public class factorial {
	public static void main(String [] args) {
		
	}
	
	public static int factorial( int n ) {
		if(n == 0) {
			return n;
		}
		return ( n * factorial(n-1));
	}
	
	/*
	 * Factorial is the product of all positive integers from 1 to n.
	 * denoted by n!
	 * n MUST be a non-negative integer
	 */

}

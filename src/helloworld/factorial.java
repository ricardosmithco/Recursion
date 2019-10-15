package helloworld;

public class factorial {
	public static void main(String [] args) {
		
		
		System.out.println(factorial(5));
		
	}
	
	public static int factorial( int n ) {
		if(n == 0) {
			return 1;
		}
		return ( n * factorial(n-1));
	}
	
	/*
	 * Factorial is the product of all positive integers from 1 to n.
	 * denoted by n!
	 * n MUST be a non-negative integer
	 */

}

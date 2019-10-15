package helloworld;

public class fibonacci {
	
	public static void main(String [] args) {
		
		System.out.println(fib(6));
		
	}
	
	private static int fib(int n) {
		if(n < 1) {
			System.out.println("error, can't have a negative number");
			return 0;
		}else {
			if(n==1 || n==2) {
				return n-1;
			}
			return ( fib(n-1) + fib(n-2) );
		}
	}

	/*
	 * Fibonacci series is a series of numbers in which each number is
	 * the sum of th two preceding numbers
	 */
}

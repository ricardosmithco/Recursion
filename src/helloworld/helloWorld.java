package helloworld;

public class helloWorld {
	
	public static void main (String [] args) {
		
			foo(3);
	}

	private static void foo(int n) {
		if(n < 1) {
			System.out.println(n);
		}else {
			 foo(n-1);
			System.out.println("Hello World " + n);
			
		}
		
	}
	
	/*
	 * An example of how recursion works in Stack memory.
	 */

}

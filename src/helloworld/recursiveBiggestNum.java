package helloworld;

public class recursiveBiggestNum {
	static int biggest = Integer.MIN_VALUE;		// static variables to be used in this entire class.
	static int z = 0;;
	
	// An array is a collection of a singular data type, whose structure is indexed and contiguous in memory.
	
	
	public static void main(String [] args) {
		
		int a[] = {105, 5, 86, 74, 75, 100};
		int x = a.length-1;
		
		System.out.println(findMax(a));
		System.out.println(recursiveMax(a, x));
		System.out.println(reversedRecursiveMax(a,z));
		
	}
	
	 public static int findMax( int arr[]) { // ITERATIVE: this method checks for the largest element in the array
		 int biggest = arr[0];				 // starting with the first element arr[0].
		 
		 for(int i =0; i < arr.length; i++) {
			 if(arr[i] > biggest) {
				 biggest = arr[i];
			 }
		 }
		 return biggest;
	 }	
	
 
	 public static int recursiveMax(int arr[], int x) { // RECURSIVE: this method checks for the largest number in the array,
		 												// from the end of the array, to the beginning.
		 if(x < 0) {									// this method takes in an array, and x = arr.length-1, which is the last
			 return biggest;							// index of the array -- starting point for this algorithm
		 }if(arr[x] > biggest) {
			 biggest = arr[x];
		 }
		 return recursiveMax(arr, (x-1));
	 }
	 
	 public static int reversedRecursiveMax(int arr[], int z) { // RECURSIVE: this method checks for the largest number in the array,
		 														// from the beginning of the array: arr[0] until the end.		 
		 if(z == arr.length) {									// this method takes in an array and z=0, as parameters.
			 return biggest;
		 }else if(arr[z] > biggest) {
			 biggest = arr[z];
		 }
		 return reversedRecursiveMax(arr, z+1);
		 
		 
	 }
	 
	 
	

}

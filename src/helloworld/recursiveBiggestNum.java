package helloworld;

public class recursiveBiggestNum {
	static int biggest = Integer.MIN_VALUE;
	static int z = 0;;
	
	// i have not completed this !!!!
	
	public static void main(String [] args) {
		
		int a[] = {105, 5, 86, 74, 75, 100};
		int x = a.length-1;
		
		System.out.println(findMax(a));
		System.out.println(recursiveMax(a, x));
		System.out.println(reversedRecursiveMax(a,z));
		
	}
	
	 public static int findMax( int arr[]) {
		 int biggest = arr[0];
		 
		 for(int i =0; i < arr.length; i++) {
			 if(arr[i] > biggest) {
				 biggest = arr[i];
			 }
		 }
		 return biggest;
	 }	
	
 
	 public static int recursiveMax(int arr[], int x) {
		 
		 if(x < 0) {
			 return biggest;
		 }if(arr[x] > biggest) {
			 biggest = arr[x];
		 }
		 return recursiveMax(arr, (x-1));
	 }
	 
	 public static int reversedRecursiveMax(int arr[], int z) { 
		 
		 if(z == arr.length) {
			 return biggest;
		 }else if(arr[z] > biggest) {
			 biggest = arr[z];
		 }
		 return reversedRecursiveMax(arr, z+1);
		 
		 
	 }
	 
	 
	

}

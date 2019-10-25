package helloworld;

public class oca {
	
	public static void main(String[] args) {
		
		float value1 = 102;
		float value2 = (int)102.0;
		//float value3 = 1f * 0.0; 			// will not compile.
		float value4 = 1f * (short)0;
		//float value5 = 1f * (boolean)0; 	// will not compile.
		
		int x = 0;
		while( ++x < 5 ) { 
			x += 1 ;
		}
		String message = x > 5? "greater than" : "less than";
		
		System.out.println(message+", "+x);
		
		 int y = 5;
		 System.out.println(++y);
		 System.out.println(y++);
		 System.out.println(y);
		
	}

}

class ocj {
	
}

class badman{
	String name = "badman";
}

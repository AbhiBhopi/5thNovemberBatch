package Exception;

public class Trycatch1 {
	
	public static void main(String[] args) {
		
		
		int a =20;
		int b=2 ;
		int c=0;
		int d [] = {12,23,34,45,56,67};	
		
		System.out.println("before try block code started");
	
		
		
		try {
			
			System.out.println("try block Risky code");
			c=a/b;
			System.out.println(d[3]);// event (exception) generated
			
			
		
		}
		
		catch(ArithmeticException Arithmetic) {
			b=2;
			c=a/b;
			System.out.println(Arithmetic);
		System.out.println("alternative code of arithmetic");
			
		}
		
		finally {
			System.out.println("Finally block executed");
		}
		
		// normal flow
		System.out.println(c); // normal flow
		
	}

}
// in case of finally block 

// Exception generated and not get handleld
// try block and finally executed


// Exception generated and get handled
// try block and catch block and Finally block and normal flow


// exception not generated
// try block and finally block and normal flow 













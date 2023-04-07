package Constructor;

public class LocalGlobal {
	
	int a=30; // global variable
	
	public void Test() {
		
		  int b=78;  // Local variable
		
		System.out.println(b); // calling local variable
		System.out.println(a); // calling global variable
		
	}
	
	public static void demo() {
		
		int c =90; // Local variable
		
		System.out.println(c);// calling local variable
		
		//System.out.println(a);// calling global variable
		
		// System.out.println(b); // local variable from another method cant be call
	}
	
	public static void main(String[] args) {
		
		LocalGlobal x = new LocalGlobal() ;
		
		x.Test();
		x.demo();
			
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

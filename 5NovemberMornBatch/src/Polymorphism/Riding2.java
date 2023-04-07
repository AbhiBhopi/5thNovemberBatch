package Polymorphism;

public class Riding2 extends Riding{  // overriding
	
	public  void Statement() {
		
		System.out.println("Method from sub class is running");
		
	}
	
	public static void main(String[] args) {
		
		Riding2 x = new Riding2();
		x.Statement();
		
		Riding y = new Riding2();
		y.Statement();
		
		Riding z = new Riding();
		z.Statement();
				
		
	}
	

}

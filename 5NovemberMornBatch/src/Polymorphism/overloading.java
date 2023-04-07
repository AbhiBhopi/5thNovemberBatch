package Polymorphism;

public class overloading {
	
	public  void addition(int a, int b) {
		
		System.out.println(a+b);
			
	}
	
	public  void addition(int a,int b,int c  ) {
		
		System.out.println(a+b+c);
		
	}
	
	
	public static void main(String[] args) {
		
//		addition(20, 30);     // caaling with class name due to static method
//		addition(20, 40, 50);
	
		overloading x = new overloading();
	
	
	
	
	}

}

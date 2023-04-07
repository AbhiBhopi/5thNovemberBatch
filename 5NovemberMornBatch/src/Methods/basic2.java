package Methods;

public class basic2 {  // calling from different class
	
	public void DemoST() {  // user define non static method declaration
		System.out.println("DemoST method running");
	}	
	
	public static void main(String[] args) {
		
		basic1.Test();// static method call from different class
		
		basic1 x = new basic1(); // object creation
		x.Demo(); // non static method call from different class
		x.Demo1();
		x.Demo2();
		
		
		basic2 y = new basic2();
		y.DemoST();
	}

}

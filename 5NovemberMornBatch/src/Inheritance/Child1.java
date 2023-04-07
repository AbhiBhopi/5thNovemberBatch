package Inheritance;

public class Child1 extends Parent{
	
	public void Cycle() {
		
		System.out.println("Cycle");
	}
	public static void main(String[] args) {
		Child1 x = new Child1();
		x.Cycle();
		x.Money();
		x.Home();
		x.Car();
		
		
	}
	
		
	}
	



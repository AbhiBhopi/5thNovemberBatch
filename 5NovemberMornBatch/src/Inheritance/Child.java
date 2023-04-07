package Inheritance;

public class Child extends Parent {
	
	Child(){
		
	}
	
	
	
	public void Bike() {
		System.out.println("Bike");
	}
	

public static void main(String[] args) {
	
	
	Child x = new Child();
	x.Car();
	x.Home();
	x.Money();
	x.Bike();
	
	
	
	
	
	
}

}

package Methods;

public class Argument {
	
	
	
	public void Multiplication(int a , int b) { //non static method with Argument
		int c = a*b;
		System.out.println("Multiplication = "+ c);
		
	}
	
	public static void addition() {
		int a=80;
		int b=90;
		int c = a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		addition();
		
		Argument x = new Argument();
		
		x.Multiplication(70,86);
		x.Multiplication(40,30);
		x.Multiplication(30,21);
	}
}

package Package1;

public class ClassB {
	
	public static void main(String[] args) {
		
		ClassA x = new ClassA();
		
		System.out.println(x.a);// calling variable with public access specifier
		//System.out.println(x.b); // Private cant be access
		System.out.println(x.c);// calling variable with Protected access specifier
		System.out.println(x.d);// calling variable with default access specifier
		
	}

}

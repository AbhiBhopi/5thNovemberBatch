package Constructor;

public class Block {
	
	// non static block
	
	{
		System.out.println("Non- Static block is running");
	}
	
	public static void main(String[] args) {
		System.out.println("Main method running");
		Block x = new Block();
		
	}
	
	// static block
	 static {
		int a;
		a=78;
		System.out.println("Static block is running");
		System.out.println(a);
	}

}

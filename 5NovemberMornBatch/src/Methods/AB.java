package Methods;

public class AB {
	
	
	public void Demo() {  // The method name is test its return nothing 
		
		System.out.println("a");
		System.out.println("b");
		System.out.println("c");
		
	}
	
	public void Diposit(int a) {
		int b =20;
		int c = a-b;
		System.out.println(c);
		
	}
	
	public static void main(String[] args) {
		
		AB x = new AB(); // object creation of class
		
		x.Demo();
		System.out.println("e");
		x.Demo();
		System.out.println("f");
		x.Demo();
		System.out.println("g");
		x.Demo();
		x.Diposit(200);
		x.Diposit(50);
		x.Diposit(300);
		
		
		
	}

}

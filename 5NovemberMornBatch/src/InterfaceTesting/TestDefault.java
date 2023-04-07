package InterfaceTesting;

public class TestDefault implements Default {
	
	public void Show() {
		System.out.println("Show method is running");
	}
	
	public void Mart() {
		System.out.println("All shops");
	}
	
	public static void main(String[] args) {
		TestDefault x = new TestDefault();
		
		x.Mart();
	}

}

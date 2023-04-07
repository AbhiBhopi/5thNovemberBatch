package InterfaceTesting;

public class Set implements Test {
	
	public void Define() {// complete method or implemented method
		
		System.out.println("method Define is running");
		
		
	}
	
	
	public void Setup() {
	
		System.out.println("method setup is running");
	}
	
	public static void main(String[] args) {
		
		Set x = new Set();// object of implementation class
		x.Setup();
		x.Define();
	}

}

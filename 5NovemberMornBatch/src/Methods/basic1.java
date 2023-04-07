package Methods;

public class basic1 { // non static method declare in same class
	                  //and call in different class
	
	
	
	
	public void main() {  // user define non static method declaration
		System.out.println("Demo method running");
	}	
	public void Demo1() {  // user define non static method declaration
		System.out.println("Demo1 method running");
	}	
	public void Demo2() {  // user define non static method declaration
		System.out.println("Demo2 method running");
	}	
	
    public static void Test() { //UD static method
		System.out.println("Test static method running");
	}
    
  
    static public void main(String[] args) {
    	
    	basic1 x= new basic1();
    	
    	Test();
    	x.main();
    	
    	
    	
	}
    
   
    
	


}
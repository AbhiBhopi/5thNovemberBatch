package String;

public class Basic {
	
	public static void main(String[] args) {
		
	String a = "velocity";
	
	String b = "velocity";
	
	String c = new String("VELOCITY");
	String d = new String("VELOCITY");	
		
		
		System.out.println(a==b); //True
		
		System.out.println(c==d); // False
		
		System.out.println(a==c); // False
		
		System.out.println("******************************");
		
		b="Testing";
		System.out.println(a);
		System.out.println(b);
		System.out.println(a==b);//False
		
		System.out.println("******************************");
		b="velocity";
		System.out.println(a);
		System.out.println(b);
		System.out.println(a==b); //True
	}
	
	
	
	
	
	

}

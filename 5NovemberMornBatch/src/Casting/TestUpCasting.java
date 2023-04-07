package Casting;

public class TestUpCasting {
	
	public static void main(String[] args) {
		
		System.out.println("**********Super class methods***************");
		
		UpCasting x = new UpCasting();
		x.Demo();
		x.Set();
		x.StaticCast();
		
		
		System.out.println("**********Sub class methods***************");
		
		UpCast1 y = new UpCast1();
		y.Demo();
		y.Set();
		y.SubClass();
		y.StaticCast();
		
		System.out.println("**********casting methods***************");
		
		UpCasting z = new UpCast1();
		
		//{ super class Ref variable = new Sub class }
		
		z.Demo();
		z.Set();
		z.StaticCast();
		
		UpCast1 up =  (UpCast1) new UpCasting();
		
		up.Demo();
		up.Set();
		up.StaticCast();
		up.SubClass();
		
		
		
		
		
	}

}

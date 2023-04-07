package Constructor;

public class StatNonStat {
	
	static int a=10;  // static variable
	int b =20;  // non static variable
	float c=50.60f;
	public static void main(String[] args) {
		System.out.println("Static variable = " +a);
		
		StatNonStat x = new StatNonStat();
		System.out.println("Non static variable with ref of x ="+x.b);//20
		
		
		StatNonStat y = new StatNonStat();
		System.out.println("Non static variable with ref of y ="+y.b);//20
		
		x.b = 30;
		System.out.println("Non static variable with ref of x ="+x.b);//30
		System.out.println("Non static variable with ref of y ="+y.b);//20
		
		System.out.println("Static variable with x ref= "+ x.a);//10
		System.out.println("Static variable with y ref= "+ y.a);//10
		
		x.a =50;
		System.out.println("Static variable with x ref updated= "+ x.a);//50
		System.out.println("Static variable with y ref updated= "+ y.a);//50
	}
	

}

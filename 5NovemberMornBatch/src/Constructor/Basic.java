package Constructor;

public class  Basic { // user define constructor with and without parameter
	
int a;
int b;
int m;
String Name;
String Velocity;
	
Basic(){ // UD constructor without parameter
	
	a=78;
	b=68;
	
}

Basic(int c, int d,int i){ // UD constructor with parameter
	
	a=c;
	b=d;
	m=i;
}

Basic (int c,int d){    // UD constructor with parameter
	
	a=c;
	b=d;
	
}
Basic(String abc, String Testing){
	Name= abc;
	Velocity= Testing;
	
	
}

public void addition() {   // non static method 
	System.out.println(m+a+b);
	int xyz;
	xyz=89;
	
}

public void test() {
	System.out.println(Name);
	System.out.println(Velocity);
}


public static void main(String[] args) {
	
	Basic x = new Basic();
	x.addition();
	
	Basic y = new Basic(20,30,40);
	y.addition();
	
	Basic z = new Basic(30,90);
	z.addition();
	
//	Basic x = new Basic();
//	x.test();
//	x.addition();
//	x.addition();
//	
//	Basic y = new Basic(56,68);
//	y.addition();
//	
//	Basic z = new Basic(10,20,30);
//	z.addition();
//	
	Basic e = new Basic("PNG","Automation");
	e.test();
}
	
	
	

}

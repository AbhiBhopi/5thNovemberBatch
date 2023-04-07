package Collection;

public class ABC <G,L>{
	
	G b;
	
G Demo(L x) {
	System.out.println(x);
	return b;
}

public static void main(String[] args) {
	
	ABC <Integer,String> y = new ABC <Integer,String>();
	
	y.b =890;
	
	int z = y.Demo("Automation");
	System.out.println(z);
	
}

}

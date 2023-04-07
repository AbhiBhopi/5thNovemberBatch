package Statement;

public class Switch {
	
	public static void main(String[] args) {
	
		String value = "a";

		switch (value) {
		
		case "a" :
			System.out.println("Today is Monday");
	break;
			
		case "b" :
			System.out.println("Today is Tuesday");
			break;	
			
		case "c" :
			System.out.println("Today is Wednesday");
			break;
			
		case "d" :
			System.out.println("Today is Thursday");
			break;
			
		case "e" :
			System.out.println("Today is Friday");
			break;
			
		case "f" :
			System.out.println("Today is saturday");
			break;
			
		case "g" :
			System.out.println("Today is Sunday");
			break;
			default:
				System.out.println("default case will be executed");
		}
		
		
		
	}
	
	

}

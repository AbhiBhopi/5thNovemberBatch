package Statement;

public class IfElseIf { // ladder if
	
	public static void main(String[] args) {
		
		String Projectdomain = "HealthCare";
		
		if (Projectdomain == "HealthCare") {
			System.out.println("Medical related work");
			
		}
		
		else if(Projectdomain == "Banking") {
			System.out.println("Money Transaction related work");
			
		}
		
		else if(Projectdomain == "Telecom") {
			System.out.println("Communication related work");
			
		}
		
		else if(Projectdomain == "Booking Portal") {
			System.out.println("Works related to Ticket booking");
			
		}
		else {
			System.out.println("Random Project Domain");
		}
		
	}

}

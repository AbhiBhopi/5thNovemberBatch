package Statement;

public class NestedIf {
	
	public static void main(String[] args) {
		
		String UN ="XYZ";
		String PWD ="a@123";
		
		if (UN=="XYZ") {
			System.out.println("Correct user name");
			
			if(PWD == "a@12") {
				System.out.println("Password is correct");
				System.out.println("Login Successful");
	
			}
			else  {
				System.out.println("Password is incorrect");
				System.out.println("Login failed");
			}
			
		}
		else {
			System.out.println("Incorrect username");
			System.out.println("Login Failed");
		}
		
		
		
		
		
		
		
	}

}

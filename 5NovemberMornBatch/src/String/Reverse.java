package String;

public class Reverse { // pallindrome the string 
	
	public static void main(String[] args) {
		
		
		String a= "121"; // 7 - 1 = 6
		String reverse = "";
		
		for(int i = a.length()-1;i>=0;i-- ) {
			reverse = reverse + a.charAt(i);
			
		}
		//System.out.println(reverse);
		
		if (a.equals(reverse)) {
			System.out.println("Given string is Pallindrome");
		}
		else {
			System.out.println("Given string is not pallindrome");
		}
		
		
		
		
		
	}

}

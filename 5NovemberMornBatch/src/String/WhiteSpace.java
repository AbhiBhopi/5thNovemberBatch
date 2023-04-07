package String;

public class WhiteSpace { // duplicate character in given string
	
	public static void main(String[] args) {
		
		String ad="ABBCBDBEEEFG H I";
		
		int total =0;
		
		for (int i =0; i <= ad.length()-1;i++) {
			
			char s = ad.charAt(i);
			//System.out.println(s);
			if(s=='E') {
				total ++;
			}
			
		}
		System.out.println(total);
		
		
		
		
		
		
		
		
	}

}

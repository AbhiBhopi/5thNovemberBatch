package ARRAY;

public class Multiple {
	
	public static void main(String[] args) {
		
		
		int a [] [] = {{21,22,23,76},{31,32,33,87},{41,42,43,90}};
		
		int b = a.length;
		System.out.println(b);
		
		for(int i=0;i<b;i++) {
			
			for(int j = 0;j<=b;j++) {
				
				
				System.out.print(a[i][j]+ "  ");
				
				
			}
			System.out.println();
		}
		
		
	}

}

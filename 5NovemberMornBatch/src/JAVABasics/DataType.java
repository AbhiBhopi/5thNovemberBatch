package JAVABasics;

public class DataType {
	
	public static void main(String[] args) {
		
	boolean stdPass = false;	// conditional DT only TRUE or FALSE output
		
	byte StdMxMarks	= 100; // values from -128 to 127 use byte instead of int to save the memory
		
	short totalMarks =500;	// value from -32768 to 32767
	
	int rollNumber = 55657; // greater than Short DT range
	
	long mobileNumber = 9898987654L; // L is mandatory when we use long
	
	double stdAvgMarks = 567.872345567676789432567;// fractional up to 15 digit
	
	float stdPercentage = 78.98f; // f is mandatory
	
	char stdGrade = 'A';
	
	System.out.println(stdPass);
	System.out.println(StdMxMarks);
	System.out.println(totalMarks);
	System.out.println(rollNumber);
	System.out.println(mobileNumber);
	System.out.println(stdAvgMarks);
	System.out.println(stdPercentage);
	System.out.println(stdGrade);
		
	}

}

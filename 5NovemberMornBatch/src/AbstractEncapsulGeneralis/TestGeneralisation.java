package AbstractEncapsulGeneralis;

public class TestGeneralisation {
	
	public static void main(String[] args) {
		
		System.out.println("************Specifocation of JIO***********");
		
		Jio x = new Jio();
		x.AudioCalling();
		x.TextMessage();
		x.Internet();
		x.NewFeature();
		
		System.out.println("************Specifocation of VI***********");
VI y = new VI();
y.AudioCalling();
y.TextMessage();
y.Internet();

System.out.println("************Specifocation of BSNL***********");

BSNL z = new BSNL();
z.AudioCalling();
z.TextMessage();
z.Internet();
z.NewFeature2();

	}

}

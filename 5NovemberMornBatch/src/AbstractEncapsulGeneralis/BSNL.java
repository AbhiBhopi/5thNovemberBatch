package AbstractEncapsulGeneralis;

public class BSNL implements Simcard {
	
public void AudioCalling() {
		
		System.out.println("16Hr Daily Audio calling ");
		
	}
	
	public void TextMessage() {
		System.out.println("Monthly 100 SMS");
	}
	
	public void Internet() {
		System.out.println("Daily 3 GB Data");
	}
	
	public void NewFeature2() {
		System.out.println("Remaining data Carryforward to weekend");
	}

}

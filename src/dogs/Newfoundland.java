package dogs;

public class Newfoundland extends Dogs implements DogCharacteristics {
	
	public Newfoundland(String vName, String vGender) {
		super(vName, vGender);}
	
	public String breedPurpose(){
		return("Working, Rescue");
	}
	
	public String coat() {
		return("Thick");
	}
	
	public String size() {
		return("Large");
	}
	
	public String description() {
		return("As the name suggests this breed originates from Newfoundland, it was orginally used for hauling nets of fishermen, with a loveable disposition which is great for children aswell as being anintelligent breed.");
	}
}


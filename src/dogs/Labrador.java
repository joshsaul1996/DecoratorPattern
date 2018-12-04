package dogs;

public class Labrador extends Dogs implements DogCharacteristics {
	
	public Labrador(String vName, String vGender) {
		super(vName, vGender);
	}
	
	public String breedPurpose(){
		return("Gun Dog");
	}
	
	public String coat() {
		return("Medium");
	}
	
	
	public String size() {
		return("Medium");
	}
	
	public String description() {
		return("The dog breed originates from the need for both a friendly companion and good working dog characteristics, well-natured and wonderful for families it is one of the most popular breeds world-wide ");
	}
}

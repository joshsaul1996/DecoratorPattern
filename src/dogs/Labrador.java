package dogs;

public class Labrador implements DogCharacteristics {
	
	@Override
	public String breedPurpose(){
		return("Gun Dog");
	}
	@Override
	public String coat() {
		return("Medium");
	}
	
	@Override
	public String size() {
		return("Medium");
	}
	@Override
	public String description() {
		return("The dog breed originates from the need for both a friendly companion and good working dog characteristics, well-natured and wonderful for families it is one of the most popular breeds world-wide ");
	}
}

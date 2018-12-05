package dogs;

public class Newfoundland implements DogCharacteristics {
	@Override
	public String breedPurpose(){
		return("Working, Rescue");
	}
	@Override
	public String coat() {
		return("Thick");
	}
	@Override
	public String size() {
		return("Large");
	}
	@Override
	public String description() {
		return("As the name suggests this breed originates from Newfoundland, it was orginally used for hauling nets of fishermen, with a loveable disposition which is great for children aswell as being anintelligent breed.");
	}
}


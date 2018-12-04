package dogs;

public class ColourDecorator extends DogDecorator {
	public Colour colour;
	
	public ColourDecorator(DogCharacteristics decoratedDoggo, Colour vColour) {
		super(decoratedDoggo);
		this.colour = vColour;
	}

	public String breedPurpose(){
		return decoratedDoggo.breedPurpose();
	}
	
	public String coat() {
		return decoratedDoggo.coat() + " it's the colour of its coat is" + colour + ".";
	}
	
	
	public String size() {
		return decoratedDoggo.size();
	}
	
	public String description() {
		return decoratedDoggo.description();
	}
}

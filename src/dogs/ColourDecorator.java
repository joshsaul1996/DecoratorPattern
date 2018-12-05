package dogs;

public class ColourDecorator extends DogDecorator {
	public Colour colour;
	
	public ColourDecorator(DogCharacteristics decoratedDoggo, Colour vColour) {
		super(decoratedDoggo);
		this.colour = vColour;
	}
	@Override
	public String breedPurpose(){
		return decoratedDoggo.breedPurpose();
	}
	@Override
	public String coat() {
		return decoratedDoggo.coat() + " it's the colour of its coat is" + colour + ".";
	}
	
	@Override
	public String size() {
		return decoratedDoggo.size();
	}
	@Override
	public String description() {
		return decoratedDoggo.description();
	}
}

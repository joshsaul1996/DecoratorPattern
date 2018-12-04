package dogs;

public class CoatDecorator extends DogDecorator {
	public Coat coat;
	
	public CoatDecorator(DogCharacteristics decoratedDoggo, Coat vCoat) {
		super(decoratedDoggo);
		this.coat = vCoat;
	}

	public String breedPurpose(){
		return decoratedDoggo.breedPurpose();
	}
	
	public String coat() {
		return decoratedDoggo.coat() + " it's coat type is" + coat + ".";
	}
	
	
	public String size() {
		return decoratedDoggo.size();
	}
	
	public String description() {
		return decoratedDoggo.description();
	}
}

package dogs;

public class CoatDecorator extends DogDecorator {
	protected Coat coat;
	
	public CoatDecorator(DogCharacteristics decoratedDoggo, Coat vCoat) {
		super(decoratedDoggo);
		this.coat = vCoat;
	}
	@Override
	public String breedPurpose(){
		return decoratedDoggo.breedPurpose();
	}
	@Override
	public String coat() {
		return decoratedDoggo.coat() + " it's coat type is" + coat + ".";
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

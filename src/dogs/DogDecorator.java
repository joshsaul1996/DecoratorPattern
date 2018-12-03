package dogs;

public abstract class DogDecorator implements DogCharacteristics{
	protected DogCharacteristics decoratedDoggo;
	
	public DogDecorator(DogCharacteristics decorateddoggo) {
		super();
		this.decoratedDoggo = decoratedDoggo;
	}
	
	
	
	
}

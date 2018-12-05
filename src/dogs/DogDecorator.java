package dogs;

public abstract class DogDecorator implements DogCharacteristics{
	protected DogCharacteristics decoratedDoggo;
	
	public DogDecorator(DogCharacteristics vDecoratedDoggo) {
		super();
		this.decoratedDoggo = vDecoratedDoggo;
	}
	
	
	
	
}

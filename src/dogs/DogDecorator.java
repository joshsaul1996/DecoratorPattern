package dogs;

public abstract class DogDecorator implements DogCharacteristics{
	public DogCharacteristics decoratedDoggo;
	
	public DogDecorator(DogCharacteristics vDecoratedDoggo) {
		super();
		this.decoratedDoggo = vDecoratedDoggo;
	}
	
	
	
	
}

package dogs;

public class Main {
	
	public static void main(String[] args) {
		
		Labrador molly = new Labrador();
		CoatDecorator ctd = new CoatDecorator(molly,Coat.DOUBLE);
		ColourDecorator crd = new ColourDecorator(ctd,Colour.BROWN);
		DogCharacteristics lab1 = crd;
		lab1.breedPurpose();
		lab1.coat();
		lab1.size();
		lab1.description();
		
		
		
		
		
		
		
		
		
		
	}

}

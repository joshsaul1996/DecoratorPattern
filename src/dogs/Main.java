package dogs;

public class Main {
	
	public static void main(String[] args) {
		
		
		Newfoundland new1 = new Newfoundland("Bert", "Male");
		Newfoundland new2 = new Newfoundland("Alfie", "Male");
		
		
		
		Labrador lab1 = new CoatDecorator(new ColourDecorator(new Labrador("Poppy", "Female");, Colour.BROWN)Coat.DOUBLE);
		
		
		
		
		
	}

}

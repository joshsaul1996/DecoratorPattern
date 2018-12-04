package dogs;

public class Dogs {
	
	
	//////////////////////////Attributes////////////////////////
	String name;
	String gender;
	
/////////////////////////Constructors///////////////////////
	public Dogs(String vName, String vGender) {
		this.name = vName;
		this.gender = vGender;}
		
		////////////////////////Methods////////////////////////////

		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
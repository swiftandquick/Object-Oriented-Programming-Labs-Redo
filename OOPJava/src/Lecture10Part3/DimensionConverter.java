package Lecture10Part3;

public class DimensionConverter {

	static float storedInches; 
	static float storedFeet; 
	
	public void setInches (float getInches) {
		storedInches = getInches; 
	}

	public void setFeet(float getFeet) {
		storedFeet = getFeet;
	}

	public float inchesToFeet() {
		return storedInches / 12; 
	}
	
	public float feetToInches() {
		return storedFeet * 12;
	}
	
}

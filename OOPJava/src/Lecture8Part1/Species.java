package Lecture8Part1;

public class Species {

	private String name; 
	private int population; 
	private double growthRate; 
	
	/** Takes parameter arguments from SpeciesEqualsDemo, then sets local variables equal to the parameter variables.  */
	public void setSpecies(String name2, int population2, double growthRate2) {
		this.name = name2;
		this.population = population2;
		this.growthRate = growthRate2; 
	}
	
	/** Returns true if all three conditional statement matches.  */
	public boolean equals(Species otherObject) {
		return (this.name.equalsIgnoreCase(otherObject.name)) && 
				(this.population == otherObject.population) && 
				(this.growthRate == otherObject.growthRate);
	}
	
}

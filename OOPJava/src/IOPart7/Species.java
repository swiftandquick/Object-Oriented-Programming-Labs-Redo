package IOPart7;

import java.io.Serializable;

/**
 * Serialized class for data on endangered species. Serializable is an interface
 * of serialization, which is for object serialization.
 */
@SuppressWarnings("serial")
public class Species implements Serializable {

	private String name;
	private int population;
	private double growthRate;
	
	/** Default constructor.  */
	Species() {
		name = null;
		population = 0;
		growthRate = 0;
	}
	
	/** Constructor with arguments.  */
	Species(String rName, int rPopulation, double rGrowthRate) {
		name = rName;
		if (rPopulation >= 0) {
			population = rPopulation;
		}
		else {
			System.out.println("Population cannot be negative.  ");
			System.out.println("Due to invalid input, population is set to 0.  ");
			population = 0;
		}
		growthRate = rGrowthRate; 
	}
	
	/**
	 * Stores the object's attributes, when it's needed to be print out, the object
	 * will be print as a string.
	 */
	public String toString() {
		return "Name = " + name + "\n" + 
				"Population = " + population + "\n" + 
				"Growth Rate = " + growthRate + "%";
	}
	
}

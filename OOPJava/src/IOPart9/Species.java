package IOPart9;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Species implements Serializable {

	private String name;
	private int population;
	private double growthRate;
	
	Species() {
		name = null;
		population = 0;
		growthRate = 0;
	}
	
	Species(String rName, int rPopulation, double rGrowthRate) {
		name = rName;
		population = rPopulation;
		growthRate = rGrowthRate;
	}
	
	public String toString() {
		return "Name = " + name + "\n" + 
				"Population = " + population + "\n" + 
				"Growth Rate = " + growthRate + "%";
	}
	
}

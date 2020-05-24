package Lecture8Part2;

import java.util.Scanner;

public class Species {
	
	/** If these variables are private, there will be errors on the SpeciesDemo class.  Because private variables can only be used in its own class.  */
	public String name;
	public int population; 
	public double growthRate; 
	
	public void readInput() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is the species' name?  ");
		name = input.nextLine();
		
		System.out.println("What is the population of the species?  ");
		population = input.nextInt();
		while (population < 0) {
			System.out.println("Population cannot be negative.  ");
			System.out.println("Re-enter population:  ");
			population = input.nextInt();
		}
		System.out.println("Enter growth rate (% increase per year):  ");
		growthRate = input.nextDouble();
		
		input.close();
	}
	
	public void writeOutput() {
		System.out.println("Name = " + name);
		System.out.println("Population = " + population);
		System.out.println("Growth rate = " + growthRate + "%");
	}
	/**
	 * Precondition:  years is a non-negative number.  
	 * Returns the projected population of the receiving object after the specified number of years.  
	 */
	public int futurePopulation(int years) {
		int result = 0;
		double populationAmount = population;
		int count = years; 
		while ((count > 0) && (populationAmount > 0)) {
			populationAmount = (populationAmount + (growthRate / 100) * populationAmount);  
			count--;
		}
		if (populationAmount > 0) {
			result = (int) populationAmount; 
		}
		return result; 
	}
	
	/**
	 * Precondition:  The object and the argument otherSpecies 
	 * both have values for their population.  
	 * Return true if the population of this object is greater 
	 * than the population of otherSpecies; otherwise, return false.  
	 */
	public boolean isPopulationLargerThan(Species otherSpecies) {
		return this.population > otherSpecies.population; 
	}

}
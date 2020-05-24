package Lecture9Part2;

import java.util.Scanner;

public class SpeciesFourthTry {

	private String name;
	private int population;
	private double growthRate;
	
	public void readInput() {
		Scanner input = new Scanner(System.in); 
		
		System.out.println("What is the species' name?  "); 
		name = input.nextLine();
		
		System.out.println("What is the population of the species?  ");
		population = input.nextInt();
		
		System.out.println("Enter growth rate (% increase per year):  ");
		growthRate = input.nextFloat();
		
		input.close();
	}
	
	public void writeOutput() {
		System.out.println("Name = " + name);
		System.out.println("Population = " + population); 
		System.out.println("Growth rate = " + growthRate + "%");
	}
		
	public int futurePopulation(int yearsIntoFuture) {
		
		int result = 0;
		// Convert int to double because growth rate is a decimal or percentage.  
		double populationAmount = population;
		
		while (yearsIntoFuture > 0 && populationAmount > 0) {
			populationAmount = populationAmount + (growthRate / 100) * populationAmount;
			yearsIntoFuture--; 
		}
		if (populationAmount > 0) {
			result = (int) populationAmount; 
		}
				
		return result; 
	}

	/** This is the setter method.  It sets local variables equal to variables from parameter.  */
	public void setSpecies(String newName, 
			int newPopulation, double newGrowthRate) {
		this.name = newName;
		if (newPopulation >= 0) {
			this.population = newPopulation; 
		}
		else {
			System.out.println("Population cannot be negative!  ");
			System.exit(0);
		}
		this.growthRate = newGrowthRate; 
	}
	
	/* These are getter methods, I never used them in the code.  
	
	public String getName() {
		return name;
	}

	public int getPopulation() {
		return population;
	}
	
	public double getGrowthRate() {
		return growthRate;
	}
	
	*/
	
}

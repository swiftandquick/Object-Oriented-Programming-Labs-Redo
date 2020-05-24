package Lecture7Part4;

import java.util.Scanner;

public class SpeciesSecondTry {

	// These are instance variables.  
	public String name;
	public int population;
	public float growthRate; 
	
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
	
	/** Unlike SpeciesFirstTry, the futurePopulation method here must take an integer in the parameter as an argument.  */
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
	
}

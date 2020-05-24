package Lecture7Part2;

public class SpeciesFirstTryDemo {

	public static void main(String args[]) {
		
		// Creates an object called speciesOfTheMonth.  
		SpeciesFirstTry speciesOfTheMonth = new SpeciesFirstTry();
		
		System.out.println("Enter data on the Species of the Month:  ");
		
		/** The object calls methods from SpeciesFirstTry class.  */
		speciesOfTheMonth.readInput();
		speciesOfTheMonth.writeOutput();

		/** Object calls the method getPopulationIn10() to get the population in 10 years.  */
		System.out.println("In ten years the population will be "
				+ speciesOfTheMonth.getPopulationIn10()); 
		
		System.out.println("The new Species of the Month:  "); 
		
		SpeciesFirstTry newSpeciesOfTheMonth = new SpeciesFirstTry();
		
		/** Sets the object's variables using instance variables from SpeciesFirstTry class.  */
		newSpeciesOfTheMonth.name = "Klingon Ox";
		newSpeciesOfTheMonth.population = 10; 
		newSpeciesOfTheMonth.growthRate = 15.0f;
		
		System.out.println("Name = " + newSpeciesOfTheMonth.name); 
		System.out.println("Population = " + newSpeciesOfTheMonth.population); 
		System.out.println("Growth Rate = " + newSpeciesOfTheMonth.growthRate + "%"); 
		System.out.println("In ten years the population will be "
				+ newSpeciesOfTheMonth.getPopulationIn10()); 
		
		
	}
	
}

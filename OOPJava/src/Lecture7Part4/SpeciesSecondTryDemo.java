package Lecture7Part4;

import java.util.Scanner;

public class SpeciesSecondTryDemo {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
				
		// Creates an object called speciesOfTheMonth.  
		SpeciesSecondTry speciesOfTheMonth = new SpeciesSecondTry();
		
		System.out.println("Enter data on the Species of the Month:  ");
		
		/* I had to put it the following two lines of code here.   
		 * Below readInput and writeOutput will result in error.  
		 */
		System.out.println("How many years in the future?  ");
		int years = input.nextInt();
		
		/** The object calls methods from SpeciesSecondTry class.  */
		speciesOfTheMonth.readInput();		
		speciesOfTheMonth.writeOutput();
		
		/** Object calls the method futurePopulation() to get the population in 10 years.  */
		System.out.println("In " + years + " years the population will be "
				+ speciesOfTheMonth.futurePopulation(years)); 
			
		System.out.println("The new Species of the Month:  "); 
		
		SpeciesSecondTry newSpeciesOfTheMonth = new SpeciesSecondTry();
		
		/** Sets the object's variables using instance variables from SpeciesSecondTry class.  */
		newSpeciesOfTheMonth.name = "Klingon Ox";
		newSpeciesOfTheMonth.population = 10; 
		newSpeciesOfTheMonth.growthRate = 15.0f;
		
		System.out.println("Name = " + newSpeciesOfTheMonth.name); 
		System.out.println("Population = " + newSpeciesOfTheMonth.population); 
		System.out.println("Growth Rate = " + newSpeciesOfTheMonth.growthRate + "%"); 
		System.out.println("In 15 years the population will be "
				+ newSpeciesOfTheMonth.futurePopulation(15)); 
		
		input.close();
		
	}
	
}

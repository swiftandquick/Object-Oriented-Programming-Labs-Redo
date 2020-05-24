package Lecture9Part2;

import java.util.Scanner;

public class SpeciesFourthTryDemo {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		SpeciesFourthTry speciesOfTheMonth = new SpeciesFourthTry(); 
		
		System.out.println("Enter number of years to project:  ");
		int numberOfYears = input.nextInt();
		
		System.out.println("Enter data on the Species of the Month:  ");
		speciesOfTheMonth.readInput(); // Uses input.  
		speciesOfTheMonth.writeOutput();
		
		int futurePopulation = speciesOfTheMonth.futurePopulation(numberOfYears);
		System.out.println("In " + numberOfYears + " years the population will be " + futurePopulation);
		
		/** No input, instead, it passes input to setter.  Using getter and setter to utilize instance variables.  */
		speciesOfTheMonth.setSpecies("Klingon ox", 10, 15);
		System.out.println("The new Species Of the Month:  ");
		speciesOfTheMonth.writeOutput();
		
		futurePopulation = speciesOfTheMonth.futurePopulation(numberOfYears);
		
		System.out.println("In " + numberOfYears + " years the population will be " + futurePopulation);
		
		input.close();
		
	}
	
}

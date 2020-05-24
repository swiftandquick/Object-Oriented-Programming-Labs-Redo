package Lecture10Part2;

import java.util.Scanner;

public class PetDemo {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		/** Calls the Pet construct that only passes in only the name variable.  */
		Pet2 yourPet = new Pet2("Jane Doe");
		System.out.println("My records on your pet are inaccurate.  ");
		System.out.println("Here is what they currently say:  ");
		yourPet.writeOutput();

		// Use setter and getter to assign values to the object's attributes.  
		
		System.out.println("Please enter the correct pet name:  ");
		String correctName = input.nextLine();
		yourPet.setName(correctName);
		
		System.out.println("Please enter the correct pet age:  ");
		int correctAge = input.nextInt();
		yourPet.setAge(correctAge);
		
		System.out.println("Please enter the correct pet weight:  ");
		double correctWeight = input.nextFloat();
		yourPet.setWeight(correctWeight);
		
		System.out.println("My updated records now say:  ");
		yourPet.writeOutput();
		
		input.close();
		
	}
	
}

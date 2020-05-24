package Lecture12;

public class Hacker {

	public static void main(String args[]) {
		
		Pet pet1 = new Pet("Faithful Guard Dog", 5, 75.0); 
		Pet pet2 = new Pet("Loyal Companion", 4, 60.5); 
		PetPair pair = new PetPair(pet1, pet2);
		
		System.out.println("Our pair:  ");
		pair.writeOutput(); 
		
		/**
		 * Privacy leak, as information of the object can be changed. The object hacker
		 * replaces the object first.
		 */
		Pet hacker = pair.getFirst();
		hacker.setPet("Dominion Spy", 1200, 500.0);
		
		pair.writeOutput();
		System.out.println("The pet wasn't so private!");
		System.out.println("Looks like a security breach.");
		
	}
	
}

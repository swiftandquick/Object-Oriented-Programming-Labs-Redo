package Lecture12;

/** PetPair object composes of two Pet objects.  */
public class PetPair {
	private Pet first, second; 
	
	PetPair(Pet rFirst, Pet rSecond) {
		first = rFirst; 
		second = rSecond; 
	}
	
	public Pet getFirst() {
		return first;
	}
	
	public Pet getSecond() {
		return second; 
	}
	
	public void writeOutput() {
		System.out.println("First pet in the pair:  ");
		first.writeOutput(); 
		System.out.println("Second pet in the pair:  ");
		second.writeOutput(); 
	}
	
}

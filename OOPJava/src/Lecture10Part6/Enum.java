package Lecture10Part6;

/** enum are a collection of named constants, once they are declared, they cannot be changed.  */
enum Level {
	LOW, MEDIUM, HIGH;
}

public class Enum {
	
	public static void main(String args[]) {
		
		/** Retrieve the Enum variable.  */
		Level l = Level.LOW; 
		System.out.println(l); 
		
		switch(l) {
			case LOW:
				System.out.println("Low level");
				break; 
			case MEDIUM:
				System.out.println("Medium level");
				break; 
			case HIGH:
				System.out.println("High level");
				break; 
		}
		
	}
	
}

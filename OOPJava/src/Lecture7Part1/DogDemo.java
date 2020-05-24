package Lecture7Part1;

public class DogDemo {

	public static void main(String args[]) {
		
		/** Creates an object balto, which is associated with the Dog class.  An object can use variables in the associated class.  For example, the object 
		 * balto can use all variables in the Dog class.  The object can also call a method from the associated class.  
		 */
		Dog balto = new Dog(); 
		balto.name = "Balto"; 
		balto.breed = "Siberian Husky"; 
		balto.age = 8; 
		balto.writeOutput(); 
		
		Dog scooby = new Dog();
		scooby.name = "Scooby";
		scooby.breed = "Great Dane";
		scooby.age = 42; 
		// Calls the method getAgeInHumanYears().  
		int scoobyHumanAge = scooby.getAgeInHumanYears();  
		
		System.out.println(scooby.name + " is a " + scooby.breed + ".  \n"
				+ "He is " + scooby.age + " years old, or " + scoobyHumanAge + " in human years.  ");
	}
	
}

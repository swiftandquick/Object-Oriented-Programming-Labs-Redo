package Lecture10Part1;

/** Most of the methods in this class are not used.  */

public class Pet {

	private String name;
	private int age; 
	private double weight; 
	
	/** This method is not used.  
	 * This is a default constructor.  Sets name as "Doge", set age and weight to 0.  */
	Pet () {
		name = "Doge";
		age = 0;
		weight = 0;
	}
	
	/** This method is not used.  
	 * Constructor that takes name, age, and weight arguments, then set local variables as variables from arguments.  */
	public Pet(String initialName, int initialAge, double initialWeight) {
		name = initialName;
		if ((initialAge < 0) || (initialWeight < 0)) {
			System.out.println("Incompatible answer.  ");
			System.exit(0);
		}
		else {
			age = initialAge;
			weight = initialWeight; 
		}
	}
	
	/** This method is not used.  
	 * A setter that sets local variables equal to variables from the arguments.  */
	public void setPet(String newName, int newAge, double newWeight) {
		name = newName; 
		if ((newAge < 0) || (newWeight < 0)) {
			System.out.println("Incompatible answer.  ");
			System.exit(0);
		}
		else {
			age = newAge; 
			weight = newWeight;
		}
	}
	
	/** This constructor sets the name equal to parameter variable, but everything else stay the same.  */
	public Pet(String initialName) {
		name = initialName; 
		age = 0; 
		weight = 0; 
	}
	
	/** This setter only sets the name.  */
	public void setName(String newName) {
		name = newName;
	}

	/** This method is not used. 
	 * This constructor sets the age equal to parameter variable, but everything else stay the same.  */
	public Pet(int initialAge) {
		name = "Doge";
		weight = 0;
		if (initialAge < 0) {
			System.out.println("Negative age!  ");
			System.exit(0);
		}
		else {
			age = initialAge; 
		}
	}

	/** This setter only sets the age.  */
	public void setAge(int newAge) {
		if (newAge < 0) {
			System.out.println("Negative age!  ");
			System.exit(0);
		}
		else {
			age = newAge; 
		}
	}
	
	/** This method is not used.  
	 * This constructor sets the weight equal to parameter variable, but everything else stay the same.  */
	public Pet(double initialWeight) {
		name = "Doge";
		age = 0;
		if (initialWeight < 0) {
			System.out.println("Negative weight.  ");
			System.exit(0);
		}
		else {
			weight = initialWeight;
		}
	}
	
	/** This setter only sets the weight.  */
	public void setWeight(double newWeight) {
		if (newWeight < 0) {
			System.out.println("Negative weight.  ");
			System.exit(0);
		}
		else {
			weight = newWeight;
		}
	}
	
	/** This getter only returns the name.  */
	public String getName() {
		return name;
	}

	/** This getter only returns the age.  */
	public int getAge() {
		return age; 
	}
	
	/** This getter only returns the weight.  */
	public double getWeight() {
		return weight; 
	}
	
	/** Writes the output of the object.  */
	public void writeOutput() {
		System.out.println("Name:  " + name);
		System.out.println("Age:  " + age + " years");
		System.out.println("Weight: " + weight + " pounds"); 
	}
	
}

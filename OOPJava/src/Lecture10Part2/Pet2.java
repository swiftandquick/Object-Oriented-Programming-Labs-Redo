package Lecture10Part2;

public class Pet2 {

	private String name; 
	private int age; 
	private double weight; 
	
	/** Constructor method, inside the method, a constructor calls another constructor.  */
	public Pet2(String initialName, int initialAge, double initialWeight) {
		set(initialName, initialAge, initialWeight);
	}
	
	public Pet2(String initialName) {
		set(initialName, 0, 0);
	}
	
	public Pet2(int initialAge) {
		set("No name yet.", initialAge, 0);
	}
	
	public Pet2(double initialWeight) {
		set("No name yet.", 0, initialWeight);
	}
	
	public Pet2() {
		set("No name yet.", 0, 0);
	}
	
	public void setPet(String newName, int newAge, double newWeight) {
		set(newName, newAge, newWeight); 
	}
	
	public void setName(String newName) {
		set(newName, age, weight); // age and weight unchanged.  
	}
	
	public void setAge(int newAge) {
		set(name, newAge, weight); // name and weight unchanged.  
	}
	
	public void setWeight(double newWeight) {
		set(name, age, newWeight); // name and age unchanged.  
	}
	
	/** Constructor calls this setter method.  */
	private void set(String newName, int newAge, double newWeight) {
		name = newName;
		if ((newAge < 0) || (newWeight < 0)) {
			System.out.println("Negative age or weight.  ");
			System.exit(0);
		}
		else {
			age = newAge;
			weight = newWeight; 
		}
	}
	
	/** Writes the output of the object.  */
	public void writeOutput() {
		System.out.println("Name:  " + name);
		System.out.println("Age:  " + age + " years");
		System.out.println("Weight: " + weight + " pounds"); 
	}
	
}

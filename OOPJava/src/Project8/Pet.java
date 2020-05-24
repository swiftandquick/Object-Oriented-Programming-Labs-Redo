package Project8;

public class Pet {

	private String name; 
	private int age; 
	private double weight;
	
	Pet() {
	}
	
	Pet(String initialName, int initialAge, double initialWeight) {
		name = initialName; 
		age = initialAge; 
		weight = initialWeight; 
	}
	
	Pet(String initialName) {
		name = initialName;
	}
	
	Pet(int initialAge) {
		age = initialAge;
	}
	
	Pet(double initialWeight) {
		weight = initialWeight; 
	}
	
	public String getName() {
		return name; 
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public int getAge() {
		return age; 
	}
	
	public void setAge(int newAge) {
		this.age = newAge; 
	}
	
	public double getWeight() {
		return weight; 
	}
	
	public void setWeight(double newWeight) {
		this.weight = newWeight; 
	}
	
	/** Supposed to be writeOutput(), but my method name is toString().  */
	public String toString() {
		return "Pet[name" + name + ", age = " + age + ", weight = " + weight + "]";
	}
	
}

package Lecture12;

public class Pet {

	private String name; 
	private int age; 
	private double weight; 
	
	Pet(String rName, int rAge, double rWeight) {
		name = rName; 
		age = rAge; 
		weight = rWeight; 
	}
	
	public void setPet(String rName, int rAge, double rWeight) {
		this.name = rName;
		this.age = rAge; 
		this.weight = rWeight; 
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age; 
	}
	
	public double getWeight() {
		return weight; 
	}
	
	public void writeOutput() {
		System.out.println("Pet[name" + name + ", age = " + age + ", weight = " + weight + "]");
	}
	
}

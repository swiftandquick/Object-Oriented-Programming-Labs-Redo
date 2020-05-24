package Lecture16Part4;

public class Fruit {

	private String name;
	
	Fruit() {
		name = "";
	}
	
	public Fruit(String rName) {
		name = rName; 
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String rName) {
		this.name = rName; 
	}
	
	public String toString() {
		return "Fruit[name = " + name + "]"; 
	}
	
}

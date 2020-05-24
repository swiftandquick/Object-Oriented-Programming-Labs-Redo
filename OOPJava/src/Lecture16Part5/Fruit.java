package Lecture16Part5;

public class Fruit implements Comparable<Fruit> {

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

	@Override
	public int compareTo(Fruit another) {
		
		// Sort names by alphabetical order.  
		return this.name.compareTo(another.name);
		// Sort names by reverse alphabetical order.  I can have only one or the other.  
		// return another.name.compareTo(this.name);
		
	}
	
}
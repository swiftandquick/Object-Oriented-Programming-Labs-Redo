package Lecture16Part6;

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

	/** This time, I try to sort by name length.  */
	@Override
	public int compareTo(Fruit another) {
		
		if ((another != null) && (another instanceof Fruit)) {
			if (this.name.length() > another.name.length()) {
				return 1;
			} else if (this.name.length() < another.name.length()) {
				return -1;
			} else {
				return 0;
			}
		}
		return -1; // Default if the other object is not a Fruit object.
		
	}
	
}

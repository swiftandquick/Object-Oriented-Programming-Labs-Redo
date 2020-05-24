package Lecture15AndLecture16;

public class Person {

	private String name; 
	
	Person() {
	}
	
	Person(String rName) {
		name = rName; 
	}
	
	public String getName() {
		return name; 
	}
	
	public void setName(String rName) {
		name = rName;
	}
	
	public boolean sameName(Person another) {
		if (this.name.equalsIgnoreCase(another.name)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void writeOutput() {
		System.out.println("Name:  " + name);
	}
	
}

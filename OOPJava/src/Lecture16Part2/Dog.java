package Lecture16Part2;

public class Dog implements Pet {

	private String name;
	
	public void naming(String rName) {
		this.name = rName; 
	}
	
	public void eat() {
		System.out.println(name + " likes to eat chicken bones.  ");
	}
	
	public void respond() {
		System.out.println("Woof.  ");
	}
	
	public void writeOutput() {
		System.out.println("Species:  dog");
		System.out.println("Name:  " + name);
	}
	
}

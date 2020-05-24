package Lecture16Part2;

public class Cat implements Pet {

	private String name;
	
	public void naming(String rName) {
		this.name = rName; 
	}
	
	public void eat() {
		System.out.println(name + " eats yummy salmon sashimi.  ");
	}
	
	public void respond() {
		System.out.println("Meow!  ");
	}
	
	public void writeOutput() {
		System.out.println("Species:  cat");
		System.out.println("Name:  " + name);
	}
	
}

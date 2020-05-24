package Lecture16Part2;

public class PackageDemo {

	public static void main(String args[]) {
	
		Dog dog = new Dog();
		dog.naming("Jimmy");
		dog.eat();
		dog.respond();
		dog.writeOutput();
		
		Cat cat = new Cat();
		cat.naming("Jenny");
		cat.eat();
		cat.respond();
		cat.writeOutput(); 
	
	}
	
}

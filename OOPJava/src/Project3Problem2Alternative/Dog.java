package Project3Problem2Alternative;

import java.util.Scanner;

public class Dog {
	
	private String name; 
	private String breed; 
	private int age; 
	
	// For some reason I cannot close Scanner.  
	Scanner input = new Scanner(System.in);
	
	public void setName() {
		System.out.println("Name:  ");
		name = input.nextLine();
	}
	
	public void setBreed() {
		System.out.println("Breed:  ");
		breed = input.nextLine();
	}
	
	public void setAge() {
		System.out.println("Age:  ");
		age = input.nextInt();
	}
	
	public String getName() {
		return name;
	}
	
	public String getBreed() {
		return breed;
	}

	public int getAge() {
		return age;
	}

}

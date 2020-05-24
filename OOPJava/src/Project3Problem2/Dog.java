package Project3Problem2;

import java.util.Scanner;

public class Dog {

	private String name;
	private String breed; 
	private int age; 
	
	public void takeInput() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the name of the dog:  ");
		this.name = input.nextLine();
		
		System.out.println("Enter the breed of the dog:  ");
		this.breed = input.nextLine();
		
		System.out.println("Enter the age of the dog:  ");
		this.age = input.nextInt();
		
		// Cannot close the Scanner object input, otherwise it will result in error.  
		// input.close();
		
	}

	public boolean equals(Dog otherDog) {
		return (this.name.equalsIgnoreCase(otherDog.name) && 
				this.breed.equalsIgnoreCase(otherDog.breed) && 
				this.age == otherDog.age);
	}
	
}

package Lecture1;

import java.util.Scanner;

public class FirstProgram {

	// Main method is a must have method for the program to run.  
	public static void main(String args[]) {
		
		// Use scanner for input.  
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hello out there.  "
				+ "\nI will add two numbers for you.  "
				+ "\nEnter two whole numbers on a line");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		System.out.print("The sum of those two number is \n" + (num1 + num2));
		
		input.close();
	}
	
}

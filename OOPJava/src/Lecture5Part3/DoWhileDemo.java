package Lecture5Part3;

import java.util.Scanner;

public class DoWhileDemo {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Enter a number:  "); 
		int number = input.nextInt();
		int counter = 1;
		
		// Do while executes at least once.  
		do {
			System.out.print(counter + ", ");
			counter++;
		} while(counter <= number);
		
		System.out.println("\nBuckle my shoe.  ");
			
		input.close();
		
	}
	
}

package Lecture5Part2;

import java.util.Scanner;

public class WhileDemo {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:  ");
		
		int number = input.nextInt();
		int counter = 1;
		
		// If the conditional statement fails, while loop ends.  
		while(counter <= number) {
			System.out.print(counter + ", ");
			counter++;
		}
		
		System.out.println("\nBuckle my shoe.  ");
			
		input.close();
		
	}
	
}

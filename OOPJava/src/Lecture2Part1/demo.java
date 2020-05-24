package Lecture2Part1;

import java.util.Scanner;

public class demo {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two whole numbers \n"
				+ "separated by one or more spaces");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		System.out.printf("You entered %d and %d\n", num1, num2);
		System.out.println("Next enter two numbers.  \n"
				+ "A decimal point is OK."); 
		double double1 = input.nextDouble(); 
		double double2 = input.nextDouble(); 
		
		/* %.2f means round to closest 2 decimal points.  
		 * %.1f means round to closest 1 decimal point.  
		 */
		System.out.printf("You entered %.2f and %.1f\n", double1, double2); 
		System.out.println("Next enter two words:  ");
		String word1 = input.nextLine(); 
		String word2 = input.nextLine(); 
		// Add quotation mark in string using %".  

		System.out.printf("You entered \"%s\" and \"%s\"\n", word1, word2);
		String line = input.nextLine();
		System.out.printf("You entered \"%s\"\n", line);
		
		input.close();
	}
	
}

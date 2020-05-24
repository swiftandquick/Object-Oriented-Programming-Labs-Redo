package Project1Problem2;

import java.util.Scanner;

public class GetCoins {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the amount of $");
		float totalAmount = input.nextFloat();
		int x100; // Modulo doesn't work for float.  
		int remainder;
		
		// Add cast to int to get integer value.  
		x100 = (int) (totalAmount * 100); 
		
		// Modulo gets the remainder of the division.  
		int quarters = x100 / 25;
		remainder = x100 % 25; 
		
		int dimes = remainder / 10;
		remainder = remainder % 10;
		
		int nickels = remainder / 5;
		remainder = remainder % 5;
		
		int pennies = remainder / 1;
		remainder = remainder % 1;
		
		System.out.println("Your money is equivalent to:  \n" + 
				quarters + " quarters, \n"
				+ dimes + " dimes, \n"
				+ nickels + " nickels, \nand "
				+ pennies + " pennies, \n"); 
				
		input.close();
		
	}
	
}

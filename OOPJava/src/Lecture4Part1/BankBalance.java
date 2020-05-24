package Lecture4Part1;

import java.util.Scanner;

public class BankBalance {

	/** Static variables cannot be changed.  */
	public static final double INTEREST_RATE = 0.02;
	public static final double OVERDRAWN_PENALTY = 8;
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);  
	
		System.out.print("Enter your checking account balance:  $");
		double balance = input.nextDouble();  
		balance = Math.round(balance * 100.0) / 100.0; // Round to 2 decimal places.  
		System.out.println("Original balance is:  $" + balance + 
				"\nAfter adjusting for one month of interest and penalties.  ");
		
		
		if (balance >= 0) {
			balance = balance + (INTEREST_RATE * balance) / 12;
			balance = Math.round(balance * 100.0) / 100.0; 
			System.out.println("Your new balance is $" + balance); 
		}
		else {
			balance = balance - OVERDRAWN_PENALTY;
			balance = Math.round(balance * 100.0) / 100.0; 
			System.out.println("Your new balance is $" + balance); 
		}
		
		input.close();
		
	}
	
}

package Project1Problem1;

import java.util.Scanner;

public class SumOfCoins {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many quarters?  ");
		int quarters = input.nextInt();
		
		System.out.println("How many dimes?  ");
		int dimes = input.nextInt();
		
		System.out.println("How many nickels?  ");
		int nickels = input.nextInt();
		
		System.out.println("How many pennies?  ");
		int pennies = input.nextInt();
		
		double totalAmount = quarters * 0.25 + dimes * 0.1 + nickels * 0.05 + pennies * 0.01;
		System.out.println("The total amount of money is $" + totalAmount);
		
		input.close();
		
	}
	
}

package Lecture11Part5;

import java.util.Scanner;

/**
 * Use recursion to get the power of the number 10. Note that result will start
 * to get weird after power of 10, perhaps that's the limit of an integer type.
 */
public class Power {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Power:  ");
		int power = input.nextInt(); 
		if (power < 0) {
			System.out.print("Power should be at least 0.  ");
			System.out.print("Power:  ");
			power = input.nextInt(); 
		}
		System.out.println("10^" + power + " = " + computeTenToThe(power));
		
		System.out.println();
		
		input.close();
		
	}
	
	/** n is the power.  */
	public static int computeTenToThe(int n) {
		
		int result;

		/**
		 * Imagine a loop, but works reversely. When it gets to 0th power, it's 1,
		 * because 10^0 = 1. Then it multiplies 10 for each degree that it has.
		 */
		if (n == 0) {
			result = 1;
		}
		else {
			result = computeTenToThe(n - 1) * 10;
		}
		
		return result;
		
	}
	
}

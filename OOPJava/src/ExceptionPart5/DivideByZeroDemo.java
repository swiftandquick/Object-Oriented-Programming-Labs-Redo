package ExceptionPart5;

import java.util.Scanner;

/** Exception will be re-throw until the correct denominator is placed.  */
public class DivideByZeroDemo {

	public static void main(String args[]) {
		
		test();
		
	}
	
	public static void test() {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter numerator:  ");
		int numerator = input.nextInt(); 
		
		System.out.println("Enter denominator:  ");
		int denominator = input.nextInt(); 
		
		numeratorTest(numerator, denominator);
		
		input.close();
	}
	
	public static void numeratorTest(int rNumerator, int rDenominator) {
		try {
			if (rDenominator == 0) {
				throw new DivideByZeroException();
			}
		}
		catch (DivideByZeroException e) {
			System.out.println("Try again.  ");
		}
		
		/** Rerun the test if denominator is 0.  */
		if (rDenominator == 0) {
			test();
		}
		else {
			printResult(rNumerator, rDenominator);
		}
		
	}
	
	public static void printResult(int rNumerator2, int rDenominator2) {
		System.out.println(rNumerator2 + " / " + rDenominator2
							+ " = " + ((double) rNumerator2 / (double) rDenominator2));
		/** Exit the program so there is no second test.  */
		System.exit(0);
	}
	
}

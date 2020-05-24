package ExceptionPart4;

import java.util.Scanner;

public class DivideByZeroDemo {

	public static void main(String args[]) {
		
		firstTest();
		
	}
	
	public static int getNumerator() {

		/** I can't close Scanner or else I will have error.  */
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter numerator:  ");
		int numerator = input.nextInt(); 
		
		return numerator;
	
	}
		
	public static int getDenominator() {

		/** I can't close Scanner or else I will have error.  */
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter denominator:  ");
		int denominator = input.nextInt(); 
		
		return denominator;
		
	}
	
	public static void firstTest() {
		int numerator = getNumerator();
		int denominator = getDenominator();
		try {
			if (denominator == 0) {
				throw new DivideByZeroException();
			}
			printResult(numerator, denominator);
		}
		/** Starts second test if denominator is 0.  */
		catch (DivideByZeroException e) {
			System.out.println("Try again.  ");
			secondTest();
		}
	}
	
	public static void secondTest() {
		int numerator = getNumerator();
		int denominator = getDenominator();
		try {
			if (denominator == 0) {
				throw new DivideByZeroException();
			}
			printResult(numerator, denominator);
		}
		catch (DivideByZeroException e) {
			System.out.println("I cannot do division by zero.  ");
			System.out.println("Since I cannot do what you want, ");
			System.out.println("the program will now end.  ");
		}
	}
	
	public static void printResult(int rNumerator2, int rDenominator2) {
		System.out.println(rNumerator2 + " / " + rDenominator2
							+ " = " + ((double) rNumerator2 / (double) rDenominator2));
		/** Exit the program so there is no second test.  */
		System.exit(0);
	}
	
}
package ExceptionPart6;

import java.util.Scanner;

public class DoDivision {

	private int numerator;
	private int denominator;
	private double quotient;
	
	public static void main(String args[]) {
		
		DoDivision doIt = new DoDivision();
		
		try {
			/** 
			 * Normally I can't call non-static classes from static classes, 
			 * but I can access non-static classes through an object.  
			 */
			doIt.doNormalCase();
		}
		/** I can try a try-catch block inside a catch block to test a second time.  */
		catch (DivideByZeroException e) {
			System.out.println("Try again.");
			try {
				doIt.giveSecondChance();
			}
			/** While within the same message, exception type variable cannot have the same name.  */
			catch (DivideByZeroException e2) {
				System.out.println("I cannot do division by zero.  ");
				System.out.println("Since I cannot do what you want, ");
				System.out.println("the program will now end.  ");
			}
		}
		System.out.println("End of program.  ");
	
	}
	
	/**
	 * Unlike the throw keyword, the throws keyword used in next to method name, as
	 * oppose to the throw keyword which is used in conditional statements.
	 */
	public void doNormalCase() throws DivideByZeroException {
		
		/** This scanner cannot be closed.  */
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter numerator:  ");
		numerator = input.nextInt();
		System.out.println("Enter denominator:  ");
		denominator = input.nextInt();
		
		if (denominator == 0) {
			throw new DivideByZeroException();
		}
		
		quotient = numerator / (double) denominator;
		System.out.println(numerator + " / " + denominator + " = " + quotient);
	
	}

	public void giveSecondChance() throws DivideByZeroException {
		
		/** This scanner cannot be closed.  */
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter numerator:  ");
		numerator = input.nextInt();
		System.out.println("Enter denominator:  ");
		denominator = input.nextInt();
		
		if (denominator == 0) {
			throw new DivideByZeroException();
		}
		
		quotient = numerator / (double) denominator;
		System.out.println(numerator + " / " + denominator + " = " + quotient);
		
	}
	
}
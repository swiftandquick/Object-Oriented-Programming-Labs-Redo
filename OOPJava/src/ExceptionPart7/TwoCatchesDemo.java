package ExceptionPart7;

import java.util.Scanner;

public class TwoCatchesDemo {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter the number of widgets produced:  ");
			int widgets = input.nextInt();
			if (widgets < 0) {
				throw new NegativeNumberException("widgets");
			}
			
			System.out.println("How many were defective?  ");
			int defective = input.nextInt();
			if (defective < 0) {
				throw new NegativeNumberException("defective widgets");
			}
			
			try {
				System.out.println("One in every " + exceptionalDivision(widgets, defective)
								+ " widgets is defective.  ");
			}
			catch (DivideByZeroException e) {
				System.out.println("Congratulations!  A perfect record!  ");
			}
			
		}
		/** e could be "widgets" (first throw) or "defective widgets" (second throw).  */
		catch (NegativeNumberException e) {
			System.out.println("Cannot have negative number of " + e.getMessage() + ".  ");
		}
		finally {
			System.out.println("End of program.  ");
		}
		
		input.close();
		
	}
	
	/** numerator = widgets, denominator = defective, denominator cannot be 0.  */
	public static double exceptionalDivision(int numerator, int denominator) throws DivideByZeroException {
		if (denominator == 0) {
			throw new DivideByZeroException();
		}
		return numerator / (double) denominator;
	}
	
}

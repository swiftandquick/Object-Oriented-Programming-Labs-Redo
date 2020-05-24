package ExceptionPart3;

import java.util.Scanner;

public class DivideByZeroDemo {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.println("Enter numerator:  ");
			int numerator = input.nextInt();
			System.out.println("Enter denominator:  ");
			int denominator = input.nextInt();
			if (denominator == 0) {
				System.out.println("Try Again.  ");
				System.out.println("Enter numerator:  ");
				numerator = input.nextInt();
				System.out.println("Enter denominator:  ");
				denominator = input.nextInt();
			}
			if (denominator == 0) {
				throw new DivideByZeroException();
			}
			System.out.println(numerator + " / " + denominator
								+ " = " + ((double) numerator / (double) denominator));
			System.out.println("End of program.  ");
		}
		catch (DivideByZeroException e) {
			System.out.println("I cannot do division by zero.  ");
			System.out.println("Since I cannot do what you want, ");
			System.out.println("The program will now end.  ");
		}
		
		// No finally block, it's not always needed.  
		
		input.close();
		
	}
	
}

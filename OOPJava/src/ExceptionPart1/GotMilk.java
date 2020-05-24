package ExceptionPart1;

import java.util.Scanner;

public class GotMilk {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		/** try block contains codes that could possibly go wrongn.  */
		try {
			System.out.println("Enter the number of donuts:  ");
			int donuts = input.nextInt();
			System.out.println("Enter the number of glasses of milk:  ");
			int milk = input.nextInt();
			/** I can always throw an error even if there's no error normally.  */
			if (donuts <= 0 || milk <= 0) {
				throw new IllegalArgumentException();
			}
			System.out.println(donuts + " donuts.  ");
			System.out.println(milk + " glasses of milk.  ");
			System.out.println("You have " + ((double) donuts / (double) milk)
								+ " donuts for each glass of milk.  ");
		}
		/**
		 * catch block begins the execution based on the exception generated while
		 * running the try-block. The existence of the catch block allows the program
		 * continue to run even after a supposed error.
		 */
		catch (IllegalArgumentException e) {
			System.out.println("No milk or/and donut!");
			System.out.println("Go buy some milk or/and donut!");
		}
		/** finally block executes codes after the try-catch blocks.  */
		finally {
			System.out.println("End of program.  ");
		}
		
		input.close();
		
	}
	
}

package ExceptionPart2;

import java.util.Scanner;

public class MilkAndDonuts {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		/**
		 * In the try block, I throw multiple custom exceptions at different situations.
		 * That way, I can catch my own custom exceptions at different conditions.
		 */
		try {
			System.out.println("Enter number of donuts:  ");
			int donuts = input.nextInt(); 
			System.out.println("Enter number of glasses of milk:  ");
			int milk = input.nextInt(); 
			if (donuts <= 0 && milk <= 0) {
				throw new NothingException();
			}
			if (donuts <= 0) {
				throw new NoDonutException();
			}
			if (milk <= 0) {
				throw new NoMilkException();
			}
			System.out.println(donuts + " donuts.  ");
			System.out.println(milk + " glasses of milk.  ");
			System.out.println("You have " + ((double) donuts / (double) milk)
								+ " donuts for each glass of milk.  ");
		}
		/** I am catching three different exceptions under different conditions.  */
		catch (NothingException e) {
			System.out.println("Exception:  No donut and milk!  ");
			System.out.println("Go buy some donut and milk.  ");
		}
		catch (NoDonutException e) {
			System.out.println("Exception:  No donut!  ");
			System.out.println("Go buy some donut.  ");
		}
		catch (NoMilkException e) {
			System.out.println("Exception:  No milk!  ");
			System.out.println("Go buy some milk.  ");
		}
		/** Executes after try block and catch blocks.  */
		finally {
			System.out.println("End of program.  ");
		}
		
		input.close();
		
	}
	
}

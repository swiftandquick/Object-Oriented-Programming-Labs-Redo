package Project4;

import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		String stay, method; 
		float c, f;
		
		/** Avoid using nextLine() for input, especially inside a loop.  */
		do {
			System.out.println("Choose a method:  " 
					+ "\n(F)  Fahrenheit to Celsius.  "
					+ "\n(C)  Celsius to Fahrenheit.  ");

			method = input.next().toLowerCase();
			/* For some reason, the following line doesn't work.  
			 * method = input.nextLine(); 
			 */
			
			while (!(method.equals("c") || method.equals("f"))) {
				System.out.println("Invalid input!  Enter C or F!  ");
				method = input.next().toLowerCase();
				/* For some reason, the following line doesn't work.  
				 * method = input.next(); 
				 */
			}
			
			switch(method) {
				case "c": 
					System.out.print("Enter the temperature in Celsius:  ");
					c = input.nextFloat(); 
					f = c * 9 / 5 + 32;
					System.out.println("Temperature in Celsius:  " + c);
					break; 
				case "f": 
					System.out.print("Enter the temperature in Fahrenheit:  ");
					f = input.nextFloat();
					c = f - 32 * 5 / 9;
					System.out.println("Temperature in Fahrenheit:  " + c);
					break; 
				default: 
					System.out.println("Invalid input!  ");
					break; 
			}
			
			
			System.out.println("Enter anything to repeat:  "
					+ "\nEnter Q to exit.  ");
			stay = input.next();
			/* For some reason, the following line doesn't work.  
			 * stay = input.nextLine();
			 */  
			
		} while (!stay.equalsIgnoreCase("Q"));
		
		System.out.println("Exiting...  ");
		
		input.close();
		
	}
	
}

package Project7Part1;

import java.util.Scanner; 

public class TimeDemo {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		int hour; 
		int minute; 
		boolean isAM; // AM = true;
		String toBeContinue = "Q";		
		
		/** Sets the time object.  */
		Time clock = new Time();
		
		do {
			System.out.print("Hour:  ");
			hour = input.nextInt();
			System.out.print("Minute:  ");
			minute = input.nextInt(); 
			
			while (!clock.isValid(hour, minute)) {
				System.out.println("Please enter the valid time range:  \n" 
						+ "Hour:  0 - 23.  Minute:  0 - 59.  ");
				System.out.print("Hour:  ");
				hour = input.nextInt();
				System.out.print("Minute:  ");
				minute = input.nextInt(); 
			}
			
			System.out.println("Choose a method:  " 
				+ "\n(1)  24 hours format.  "
				+ "\n(2)  12 hours format.  "); 
			int method = input.nextInt();
			while (!(method == 1 || method == 2)) {
				System.out.println("Please choose either 1 or 2!  ");
				System.out.println("Choose a method:  " 
						+ "\n(1)  24 hours format.  "
						+ "\n(2)  12 hours format.  "); 
				method = input.nextInt();
			}
			
			switch (method) {
				case 1:
					clock.setTime(hour, minute);
					System.out.println(clock.getTime24());
					break;
				case 2:
					if (hour <= 11) {
						isAM = true; // AM
					}
					else {
						isAM = false; // PM
					}
					clock.setTime(hour, minute, isAM);
					System.out.println(clock.getTime12());
					break; 
				default: 
					// It will not get to this.  
					break;
			}
			
			System.out.println("Do you want to continue or quit?  "
					+ "\nType \"Q\" to quit, anything else to continue.  ");
			toBeContinue = input.next();
			
		} while (!toBeContinue.equalsIgnoreCase("Q"));
		
		input.close();
		
		
	}
	
}

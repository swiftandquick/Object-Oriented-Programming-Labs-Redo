package Lecture11Part1;

public class Recursion {

	/** Main method calls the recursion method.  */
	public static void main(String args[]) {
		Countdown(3); 
	}
	
	/** The method continues to invoke itself until the number is less than 0.  */
	public static void Countdown(int number) {
		
		if (number < 0) {
			System.out.println("Can't go below 0!");
		}
		else {
			System.out.println(number);
			number--;
			Countdown(number);
		}
		
	}
	
}

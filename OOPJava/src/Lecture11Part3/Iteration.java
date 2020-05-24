package Lecture11Part3;

/** Iteration version of the recursion class in lecture 11 part 1.  */
public class Iteration {

	public static void main(String args[]) {
		Countdown(3);
	}
	
	public static void Countdown(int number) {
		
		/** No initial statement since number is already set as 3.  */
		for(; number >= 0; number--) {
			System.out.println(number);
		}
		
	}
	
}

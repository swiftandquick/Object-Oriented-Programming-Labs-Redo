package Lecture11Part4;

import java.util.Scanner;

public class FindingZeros {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a non-negative number:  ");
		int number = input.nextInt();
		System.out.println(number + " contains " + NumberOfZeros(number) + " zeros.  ");
		
		input.close();
		
	}
	
	public static int NumberOfZeros(int n) {
		
		int result; 
		
		/**
		 * Recursion checks the smallest digit first, so if it's 0, result is
		 * initialized as 1, if it's not 0 but less than 10, then result is 0. The
		 * recursive method divides by 10 until the number is smaller than 10, then it
		 * checks the smallest digit.  Then, it goes back and checks the second 
		 * smallest digit, then third smallest digit.  Add 1 to the result if each 
		 * subsequent checked digit is 0.  Checking via modulo of 10.  
		 */
		if (n == 0) {
			result = 1;
		}
		else if (n < 10) {
			result = 0; 
		}
		else if (n % 10 == 0) {
			result = NumberOfZeros(n / 10) + 1;
		}
		else {
			result = NumberOfZeros(n / 10);
		}
		
		return result; 
		
	}
	
}

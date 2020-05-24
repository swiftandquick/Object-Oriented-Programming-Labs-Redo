package Lecture4Part4;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two numbers:  "); 
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		
		/** max equals to n1 if n1 > n2 is true.  
		 * max equals to n2 if n1 > n2 is false.  */
		int max = (n1 > n2) ? n1 : n2;  

		System.out.println("The maximum of two numbers is:  " + max);
		
		input.close();

	}
	
}

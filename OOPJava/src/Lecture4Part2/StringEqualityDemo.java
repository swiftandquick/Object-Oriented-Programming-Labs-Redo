package Lecture4Part2;

import java.util.Scanner;

public class StringEqualityDemo {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two lines of text:  "); 
		
		String s1 = input.nextLine();
		String s2 = input.nextLine();
		
		if (s1.equals(s2)) {
			System.out.println("The two lines are equal.  "); 
			System.out.println("The two lines are equal.  "); 
		}
		else {
			System.out.println("The two lines are not equal.  "); 
			System.out.println("The two lines are not equal.  "); 	
		}
		if (s1.equalsIgnoreCase(s2)) {
			System.out.print("But the lines are equal, ignoring case.  ");
		}
		else {
			System.out.println("Even ignoring case, the lines are not equal.  ");
		}

		// Close the input object.  
		input.close();
	
	}
}

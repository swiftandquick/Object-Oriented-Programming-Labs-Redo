package Lecture18Part2;

import java.util.ArrayList;

public class Greetings {

	public static void main(String args[]) {
		
		System.out.println("All greetings:  \n");
		
		/** Initalize an array list with the length of 5.  */
		ArrayList<String> greetings = new ArrayList<String>(5);
		
		greetings.add("Hello!  How are you?  "); // index 0
		greetings.add("Hi man, what's up!  "); // index 1
		greetings.add("Yo!  How's going?  "); // index 2
		greetings.add("Hey!  How are you doing?  "); // index 3
		greetings.add("Howdy, partner.  "); // index 4
		
		for (int i = 0; i < greetings.size(); i++) {
			System.out.println(greetings.get(i));
		}
		
		System.out.println();
		
		/** Alternate way to print out each greeting.  */
		for (String greeting : greetings) {
			System.out.println(greeting);
		}
		
	}
	
}

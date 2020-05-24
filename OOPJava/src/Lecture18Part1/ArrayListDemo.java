package Lecture18Part1;

import java.util.*; /** ArrayList and Scanner.  */

public class ArrayListDemo {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		String entry, moreItems;
		int index = 0;
		
		System.out.println("Enter items for the list, when prompted.  ");
		
		/**
		 * I can put in how many indices I want in the parenthesis in the end. If I
		 * don't put in anything, then the default size is 0. However, the size of the
		 * array list can change depend on how much elements I add. Also, note that
		 * String is an object, not a primitive type, so I can have an array list of
		 * String elements.
		 */
		ArrayList<String> entries = new ArrayList<String>();
		
		do {
			System.out.println("Type an entry:  ");
			entry = input.nextLine();
			entries.add(index, entry);
			index++;
			/** This also works "entries.add(entry);".  It will start adding entry from low index to high. */
			System.out.print("More items for the list?  ");
			moreItems = input.nextLine();
		} while (moreItems.equalsIgnoreCase("yes"));
		
		input.close(); // Closing input.  
		
		/** Trim the array list down to necessity size to save memory.  */
		entries.trimToSize();
		
		System.out.println("The list contains:  ");
		
		/** Reset index to 0 in the for loop to print out all the indices.  */
		for (index = 0; index < entries.size(); index++) {
			System.out.println(entries.get(index));
		}
		
	}
	
}

package Lecture19Part2;

public class StringLinkedListDemo {

	public static void main(String args[]) {
		
		StringLinkedList entries = new StringLinkedList();
		
		entries.addANodeToStart("Four"); // [Four]
		entries.addANodeToStart("Three"); // [Three, Four]
		entries.addANodeToStart("Two"); // [Two, Three, Four]
		entries.addANodeToStart("One"); // [One, Two, Three, Four]
		
		/** Check the current list and its length.  */
		entries.showList();
		
		/** Check if the element "One" is on the list.  */
		System.out.println("Is One on the list?  ");
		System.out.println(entries.onList("One") ? "Yes.  " : "No.  "); // true
		
		/** Delete head node (One) from the list and check again.  */
		entries.deleteHeadNode(); // [Two, Three, Four]
		System.out.println("Is One on the list?  ");
		System.out.println(entries.onList("One") ? "Yes.  " : "No.  "); // false

		/** Get the length of the list.  */
		System.out.println("Number of elements:  " + entries.length());
		
		/**
		 * Get the entries as an array, then pass the array to printArray() method to
		 * print individual elements out.
		 */
		printArray(entries.toArray());
		
	}
	
	public static void printArray(String[] array) {
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}
	
}

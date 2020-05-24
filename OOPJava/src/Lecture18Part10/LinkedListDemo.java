package Lecture18Part10;

import java.util.*;

/**
 * Like an array list, a linked list stores objects. Unlike an array list, the
 * run time generally faster when manipulate a linked list.
 */
public class LinkedListDemo {

	public static void main(String args[]) {
		
		/** Create an object of class linked list.  */
		LinkedList<String> object = new LinkedList<String>();
		
		/** Adding elements to the linked list.  */
		object.add("A"); // [A]
		object.add("B"); // [A, B]
		object.addLast("C"); // [A, B, C]
		object.addFirst("D"); // [D, A, B, C]
		object.add(2, "E"); // [D, A, E, B, C]
		object.add("F"); // [D, A, E, B, C, F]
		object.add("G"); // [D, A, E, B, C, F, G]
		System.out.println("Linked list:  " + object);
		
		/** Removing elements from the linked list.  */
		object.remove("B"); // [D, A, E, C, F, G]
		object.remove(3); // [D, A, E, F, G]
		object.removeFirst(); // [A, E, F, G]
		object.removeLast(); // [A, E, F]
		System.out.println("Linked list after deletion:  " + object);
		
		System.out.println(object.contains("E") ? 
				"List contains the element E" : 
				"List doesn't contain the element E"); // true
		
		/** Number of elements in linked list.  */
		System.out.println("Size of linked list:  " + object.size()); // 3
		
		System.out.println("Index 2 element:  " + object.get(2)); // F
		object.set(2, "Y"); // [A, E, Y]
		System.out.println("Linked list after change:  " + object);
	}
	
}

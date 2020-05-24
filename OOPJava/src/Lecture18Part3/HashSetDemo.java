package Lecture18Part3;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String args[]) {
		
		/** I cannot use primitive type, so I use Integer instead.  */
		HashSet<Integer> set = new HashSet<Integer>();
		
		set.add(2);
		set.add(3);
		set.add(7);
		printSet(set);
		
		/** Removes the element 3, now it only contains 2 elements.  */
		set.remove(3);
		printSet(set);
		
		/** Check if the set contains a certain object.  */
		System.out.println("Set contains 2:  " + set.contains(2));
		System.out.println("Set contains 3:  " + set.contains(3));
		
	}
	
	/** Prints out every element from the set.  */
	public static void printSet(HashSet<Integer> rSet) {
		System.out.println("The set contains:  ");
		for (Integer element : rSet) {
			System.out.println(element);
		}
	}
	
}

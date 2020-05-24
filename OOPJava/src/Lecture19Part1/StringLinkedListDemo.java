package Lecture19Part1;

public class StringLinkedListDemo {

	public static void main(String args[]) {
		
		/** Create an object entries with the type as StringLinkedList.  */
		StringLinkedList entries = new StringLinkedList();
		
		/** At elements on the list.  */
		entries.addANodeToStart("One"); // One
		entries.addANodeToStart("Two"); // Two, One
		entries.addANodeToStart("Three"); // Three, Two, One
		
		/** Print the list.  */
		entries.showList();
		
		/** Check if the element "Three" is on list, it should be true.  */
		if(entries.onList("Three")) {
			System.out.println("Three is on list.  ");
		}
		else {
			System.out.println("Three is NOT on list.  ");
		}
		
		/** Delete all 3 of the current head nodes.  */
		entries.deleteHeadNode(); // Head node is Three, deletes Three.  Two, One.  
		entries.deleteHeadNode(); // Head node is Two, deletes Two.  One.  
		entries.deleteHeadNode(); // Head node is One, now the object has no strings.  
		
		/** Check again see if three is on the list.  */
		if(entries.onList("Three")) {
			System.out.println("Three is on list.  ");
		}
		else {
			System.out.println("Three is NOT on list.  ");
		}
		
		/** Now check how many elements are in the object entries.  */
		System.out.println("Start of list:  ");
		entries.showList();
		System.out.println("End of list.  ");
		
	}
	
}

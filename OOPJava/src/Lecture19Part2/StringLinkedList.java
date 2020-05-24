package Lecture19Part2;

/** StringLinkedList is a self contained class with an inner class inside it.  */
public class StringLinkedList {

	private ListNode head;
	
	StringLinkedList() {
		head = null;
	}
	
	/**
	 * Displays data on the list. Now that the outer class has direct access to the
	 * inner class' instance variables data and link, I no longer need getter to
	 * access those variables.
	 */
	public void showList() {
		ListNode position = head;
		while (position != null) {
			System.out.println(position.data);
			position = position.link;
		}
	}
	
	/** Returns the number of nodes on the list.  */
	public int length() {
		int count = 0;
		ListNode position = head;
		while (position != null) {
			count++;
			position = position.link;
		}
		return count;
	}
	
	/** Adds a node containing the data addData at the start of the list.  */
	public void addANodeToStart(String addData) {
		head = new ListNode(addData, head);
	}
	
	/** Deletes the first node on the list.  */
	public void deleteHeadNode() {
		if (head != null) {
			head = head.link;
		}
		else {
			System.out.println("Deleting from an empty list.  ");
			System.exit(0);
		}
	}
	
	/** Sees whether target is on the list.  */
	public boolean onList(String target) {
		return (find(target) != null);
	}
	
	/**
	 * Returns a reference to the first node containing the target data. If target
	 * is not on the list, returns null.
	 */
	private ListNode find(String target) {
		boolean found = false; 
		ListNode position = head; 
		while ((position != null) && !found) {
			String dataAtPosition = position.data;
			if (dataAtPosition.contentEquals(target)) {
				found = true;
			}
			else {
				position = position.link;
			}
		}
		return position;
	}
	
	/** 
	 * An iterator can allow me to step through a collection of nodes in a linked 
	 * list.  The following method returns an array of elements on the list.  
	 */
	public String[] toArray() {
		String[] array = new String[length()]; 
		ListNode position = head;
		int i = 0;
		while (position != null) {
			array[i] = position.data;
			i++;
			position = position.link;
		}
		return array;
	}
	
	/**
	 * For security reasons, ListNode set as private then is place inside
	 * StringLinkedList. ListNode is an inner class, the outer class and inner class
	 * share instance variables and method together, even the private ones. Due to
	 * this reason, getters and setters are not needed. Besides, the getter method
	 * can be accessed from the main method, so information can be altered, it's
	 * safer to operate without the getter method.
	 */
	private class ListNode {
		private String data;
		private ListNode link;
		
		/** Default constructor.  */
		/* ListNode() {
			data = null;
			link = null;
		} */
		
		/** Constructor with arguments.  */
		ListNode(String rData, ListNode rLink) {
			this.data = rData; 
			this.link = rLink; 
		}
	}
	
}

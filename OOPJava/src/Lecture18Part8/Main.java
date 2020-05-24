package Lecture18Part8;

public class Main {

	public static void main(String args[]) {
		
		/**
		 * I created the BaseType Test, inside Test, I have two parameter types, A and B.  
		 */
		Test <String, Integer> data = new Test<String, Integer>("Fifteen", 15);		
		data.print();
		
		/**
		 * I also have the freedom to flip the Integer and String type, since the types
		 * A and B in the Test class are not represent by a specific type, so any type
		 * works, as long it passes in the same number of parameter arguments.
		 */
		Test <Integer, String> data2 = new Test<Integer, String>(15, "Fifteen");
		data2.print();
		
	}
	
}

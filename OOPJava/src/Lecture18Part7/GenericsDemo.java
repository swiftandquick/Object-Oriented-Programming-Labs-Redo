package Lecture18Part7;

/**
 * Instead of using built in generics classes such as ArrayList, HashSet, and
 * HashMap, I set up the Generics class as the base type.
 */
public class GenericsDemo {

	public static void main(String args[]) {
		
		Generics <Integer> object = new Generics<Integer>(15);	
		System.out.println(object.getData());
		
		Generics <String> object2 = new Generics<String>("Fourteen");
		System.out.println(object2.getData());
		
		/** I can use the setData method to change Fourteen to Fifteen.  */
		object2.setData("Fifteen");
		System.out.println(object2.getData());
		
	}
	
}

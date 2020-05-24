package Lecture18Part5;

import java.util.HashMap;

/** Same as before, but this time, I let String be the key value.  */
public class HashMapDemo {

	public static void main(String args[]) {
		
		/** Format is HashMap<key, value>, this time String is key.  */
		HashMap<String, Integer> mountains = new HashMap<String, Integer>();
		
		mountains.put("K2", 28251);
		mountains.put("Denali", 20355); 
		mountains.put("Kangchenjunga", 28169); 
		mountains.put("Everest", 29029); 
		printMap(mountains);
		
		/** Now String is the key, I check if it containsKey() instead of containsValue().  */
		System.out.println("Denali in the map:  " + mountains.containsKey("Denali"));
		
		/**
		 * Changing the key of Denali. Since String (mountain name) is the key this
		 * time, I don't have to use the remove() method inside the put() method, I can
		 * just update it with only put() method.  
		 */
		System.out.println("Changing the height of Denali.  ");
		mountains.put("Denali", 20320);
		printMap(mountains); 
		
		/**
		 * Removing Kangchenjunga, since String is key, I can just use remove the String
		 * rather than the Integer.
		 */
		System.out.println("Removing Kangchenjunga");
		mountains.remove("Kangchenjunga");
		printMap(mountains);
		
	}
	
	/** Loop through every key (as a String called mountain), and get value based on key.  */
	public static void printMap(HashMap<String, Integer> rMountains) {
		System.out.println("Map contains:  ");
		for (String mountain : rMountains.keySet()) {
			System.out.println(mountain + " --> " + rMountains.get(mountain) + " feet.  ");
		}
	}
	
}

package Lecture18Part4;

import java.util.HashMap;

/**
 * Note, this is not a good thinking process. Height may be equal between
 * mountains, but names of mountain are unique, so key should be String.
 */
public class HashMapDemo {

	public static void main(String args[]) {
		
		/**
		 * Unlike HashSet, HashMap is declared in a pair of variables. The integer,
		 * which represents the height of the mountain, is the key.  HashMap objects 
		 * are store as a pair, with <key, value> in declaration, key on the left 
		 * side, and value on the right side.  
		 */
		HashMap<Integer, String> mountains = new HashMap<Integer, String>();
		
		/** Use put instead of add.  */
		mountains.put(28251, "K2");
		mountains.put(20355, "Denali");
		mountains.put(28169, "Kangchenjunga");
		mountains.put(29029, "Everest"); 
		printMap(mountains);

		/** Checks if Denali is in the HashMap.  */
		System.out.println("Denali in the map:  " + mountains.containsValue("Denali"));
		
		/** Removes Denali's old key and add a new key.  */
		System.out.println("Changing height of Denali.  ");
		mountains.put(20320, mountains.remove(20355)); // Key replacement.  
		printMap(mountains); 
		
		/**
		 * Removes Kangchenjunga from the HashMap. I only need to remove the key to
		 * remove the value as well.  
		 */
		System.out.println("Remove Kangchenjunga.  "); 
		mountains.remove(28169); 
		printMap(mountains); 
		
	}

	/** height is the key, and mountains.get(height) gets the corresponding value of the key.  */
	private static void printMap(HashMap<Integer, String> mountains) {
		System.out.println("Map contains:  ");
		for (Integer height : mountains.keySet()) {
			System.out.println(mountains.get(height) + " --> " + height + " feet.  ");
		}
	}
	
}
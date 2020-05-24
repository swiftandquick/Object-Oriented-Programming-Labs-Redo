package Lecture18Part6;

import java.util.HashMap;

public class Restaurant {

	public static void main(String args[]) {
		
		/** The dish's name (String) is the key, the cost (Integer) is the value.  */
		HashMap<String, Integer> dishes = new HashMap<String, Integer>();
		dishes.put("ham", 6);
		dishes.put("turkey", 25);
		dishes.put("corn", 3); 
		dishes.put("pie", 7); 
		
		printMenu(dishes);
		
		/** Adding a new dish.  */
		System.out.println("Now, we serve breads!  ");
		dishes.put("bread", 4); 
		printMenu(dishes);
		
		/** Changing the price of the bread.  */
		System.out.println("Sorry, we put up the wrong price for bread.  ");
		dishes.replace("pie", 3);
		// dishes.put("pie", 10);  <-- I can also try this.  
		printMenu(dishes);
		
	}
	
	public static void printMenu(HashMap<String, Integer> rDishes) {
		System.out.println("Welcome to Dr. Jones' restaurant, here's our menu:  ");
		for (String food : rDishes.keySet()) {
			System.out.println(food + "\t" + "$" + rDishes.get(food)); 
		}
	}
	
}

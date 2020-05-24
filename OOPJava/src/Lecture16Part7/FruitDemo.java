package Lecture16Part7;

import java.util.Arrays;

public class FruitDemo {

	public static void main(String args[]) {
		/** Set the array indexes by giving them names.  */
		Fruit[] fruits = new Fruit[4];
		
		fruits[0] = new Fruit("Orange", "Empty description.  ", 70); 
		fruits[1] = new Fruit("Apple", "Empty description.  ", 80);
		fruits[2] = new Fruit("Kiwi", "Empty description.  ", 90);
		fruits[3] = new Fruit("Durian", "Empty description.  ", 100);
		
		/** Easy way to sort fruits.  */
		Arrays.sort(fruits);
		
		for (Fruit fruit : fruits) {
			System.out.println("Fruit Name = " + fruit.getFruitName()); 
			System.out.println("Fruit Description = " + fruit.getFruitDesc()); 
			System.out.println("Quantity = " + fruit.getQuantity()); 
		}
	}
	
}

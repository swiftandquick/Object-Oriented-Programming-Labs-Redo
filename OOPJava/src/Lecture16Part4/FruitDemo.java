package Lecture16Part4;

import java.util.*; // Arrays & Scanner.  

public class FruitDemo {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		int number;
		String fruitName;
		
		System.out.println("How many fruits are there?  "); 
		number = input.nextInt();
		while (number <= 0) {
			System.out.println("Please try a positive number.  "); 
			System.out.println("How many fruits are there?  "); 
			number = input.nextInt();
		}
		
		/** Declare the initial size of the fruit.  */
		Fruit[] fruits = new Fruit[number];

		for (int i = 0; i < fruits.length; i++) {
			System.out.print("Add new fruit:  ");
			/**
			 * nextLine() doesn't work, so I have to use the next keyword, that means it
			 * only accepts input up until it detects a space.
			 */
			fruitName = input.next();
			fruits[i] = new Fruit(fruitName);
		}
		
		/** Use two arrays, one to retrieve the names, other to print them.  */
		
		/** Initialize a string array.  */
		String[] fruitList = new String[number];
		
		/** Sort the fruits by alphabetical order.  */
		for (int i = 0; i < fruits.length; i++) {
			fruitList[i] = fruits[i].getName();
		}
		
		/** Sort the array alphabetically.  */
		Arrays.sort(fruitList);
		
		for(int i = 0; i < fruitList.length; i++) {
			System.out.println(fruitList[i]);
		}
		
		input.close(); 
		
	}
	
}

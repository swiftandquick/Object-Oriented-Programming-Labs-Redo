package Lecture9Part3;

import java.util.Scanner;

public class PurchaseDemo {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		/** Creates an object called purchase.  */
		Purchase purchase = new Purchase();
		
		System.out.println("Enter name of item you are purchasing:  ");
		String itemName = input.nextLine();
		
		System.out.println("Enter price of item as two numbers.  "
				+ "\nFor example, 3 for $2.99 is entered as "
				+ "\n3 2.99\nEnter price of item as two numbers, now:  ");
		int fixNumber = input.nextInt();
		double fixPrice = input.nextDouble();
		while (fixNumber <= 0 || fixPrice <= 0) {
			System.out.println("Please put in valid quantity and price!  ");
			System.out.println("Enter price of item as two numbers.  "
					+ "\nFor example, 3 for $2.99 is entered as "
					+ "\n3 2.99\nEnter price of item as two numbers, now:  ");
			fixNumber = input.nextInt();
			fixPrice = input.nextDouble();
		}
		
		System.out.println("Enter number of items purchase:  ");
		int numberOfItems = input.nextInt();
		while(numberOfItems <= 0) {
			System.out.println("Number must be positive.  Try again.  ");
			System.out.println("Enter number of items purchase:  ");
			numberOfItems = input.nextInt();
		}
		
		/** Passes in variables to the setter.  */
		purchase.setPurchase(itemName, fixNumber, fixPrice, numberOfItems);
		
		String itemName2 = purchase.getItemName(); 
		int fixNumber2 = purchase.getFixNumber(); 
		double fixPrice2 = purchase.getFixPrice(); 
		int numberOfItems2 = purchase.getNumberOfItems(); 
		
		System.out.println(numberOfItems2 + itemName2); 
		System.out.println("at " + fixNumber2 + " for $" + fixPrice2);
		
		double costOfEach2 = purchase.getCostOfEach();
		double totalCost2 = purchase.getTotalCost();
		
		System.out.println("Cost each $" + costOfEach2);
		System.out.println("Total cost $" + totalCost2);
		
		input.close();
		
	}
	
}

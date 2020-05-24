package Lecture3Part1;

public class EggBasket {

	public static void main(String args[]) {
		
		/** These are variables, they are a place to store data.  
		 * Syntax with assigned value:  type identifier = value; 
		 * Syntax without assigned value:  type identifier1, identifier2, variableN. 
		 * Identifiers are case sensitive, and they cannot be be keywords or reserved words.   
		 */
		int eggs = 6; 
		int baskets = 10; 
		System.out.println("If you have \n" + eggs  + " eggs per basket and \n"
				+ baskets + " baskets, then \n" + 
				"the total number of eggs " + eggs * baskets);
	}
	
}

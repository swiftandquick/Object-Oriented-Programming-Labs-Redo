package Project2Problem2;

import java.util.Scanner;

public class CaesarsCipher {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Your string input is:  ");
		String string = input.nextLine();

		// Convert string to an array of characters.  
		char[] characters = string.toCharArray();
		int charToNum;
		char numToChar;
		String charToString;
		
		String newString;
		int shift = 1; // From 1 to 25;
		
		/** Inner for loop shifts all characters by 1.  */
		
		while (shift <= 25) {
		
			// Resets newString to an empty string.  
			newString = "";
			
			for (int i = 0; i < string.length(); i++) {
			
				// Transform character to integer.  
				charToNum = (int) characters[i]; 
			
				// Upper case letters.  
				if (charToNum >= 65 && charToNum <= 90) {
					charToNum = (int) characters[i] + shift; 
					// Cycles back to 'A' once the character goes beyond 'Z'.  
					if (charToNum > 90) {
						charToNum = charToNum % 90 + 64;
					}
				}
				// Lower case letters.  
				else if (charToNum >= 97 && charToNum <= 122) {
					charToNum = (int) characters[i] + shift; 
					// Cycles back to 'a' once the character goes beyond 'z'.  
					if (charToNum > 122) {
						charToNum = charToNum % 122 + 96;
					}
				}
				else {
					System.out.println("You can only use letters!  ");
					System.exit(0); 
				}
			
				numToChar = (char) charToNum;
				charToString = Character.toString(numToChar);
				newString = newString + charToString;
			}
			
			System.out.println("Decryption #" + shift + ":  " + newString); 			
			shift++;
		
		}
		
		input.close();
		
	}
	
}
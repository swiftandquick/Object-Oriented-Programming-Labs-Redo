package Project2Problem1;

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
		
		String newString = "";
		
		for(int i = 0; i < string.length(); i++) {
			
			// Transform character to integer.  
			charToNum = (int) characters[i]; 
			
			if ((charToNum >= 65 && charToNum <= 88) || 
					(charToNum >= 97 && charToNum <= 120)) {
				charToNum = (int) characters[i] + 2; 
			}
			else if (charToNum == 89) {
				charToNum = 65; // Y -> A
			}
			else if (charToNum == 90) {
				charToNum = 66; // Z -> B
			}
			else if (charToNum == 121) {
				charToNum = 97; // y -> a
			}
			else if (charToNum == 122) {
				charToNum = 98; // z -> b
			}
			else {
				System.out.println("You can only use letters!  ");
				System.exit(0); 
			}
			
			numToChar = (char) charToNum;
			charToString = Character.toString(numToChar);
			newString = newString + charToString;
		}
		
		System.out.println(newString); 
		
		input.close();
		
	}
	
}

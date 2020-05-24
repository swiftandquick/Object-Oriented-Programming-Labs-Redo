package IOPart4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SalesDemo {

	public static void main(String args[]) {
		
		/** Below is the absolute path, I can use relative path now.  
		 * String file = "C:\\Users\\Yong Chen\\Desktop\\Eclipse Work Space"
				+ "\\Java Object Oriented Programming\\OOPJava\\src\\IOPart4\\sales.txt";
		*/
		String file = "src/IOPart4/sales.txt";
		Scanner readFile = null;
		
		/** Counts the number of entries, first line doesn't count so entries starts as -1.  */
		int entries = -1; 
		int lines = 0;
		
		/** Initialize an empty array with 5 elements, which will be used later.  */
		String table[] = new String[5];
		
		try {
			readFile = new Scanner(new File(file));
			System.out.println("The file has the following content:  \n");
			while (readFile.hasNextLine()) {
				String currentLine = readFile.nextLine();
				System.out.println(currentLine);
				if (lines >= 0) {
					table[lines] = currentLine;
				}
				lines++;
				entries++;
			}
			System.out.println("\nNumber of Entries:  " + entries);
			tableCreation(table);
		}
		catch (FileNotFoundException e){
			System.out.println("File not located.  ");
		}
		
		readFile.close();
		
	}
	
	public static void tableCreation(String[] rTable) {
		
		String[][] newTable = new String[rTable.length][4];
		double totalCost = 0;
		
		for(int row = 0; row < rTable.length; row++) {
			
			/** Split the row into different smaller arrays by ",".  */
			newTable[row] = rTable[row].split(",");
			
			for (int column = 0; column < newTable[row].length; column++) {
				if (column == 2) {
					System.out.print("$");
				}
				System.out.print(newTable[row][column] + ", ");
			}
			
			if (row == 0) {
				System.out.println("Cost of Items");
			}
			else {
				double costOfItems = Integer.parseInt(newTable[row][1]) * Double.parseDouble(newTable[row][2]);
				totalCost = totalCost + costOfItems;
				System.out.print("$" + costOfItems);
			}
			
			System.out.println();
		}
		
		System.out.println("\nThe total cost of all items is $" + totalCost + ".  ");
		
	}
	
}

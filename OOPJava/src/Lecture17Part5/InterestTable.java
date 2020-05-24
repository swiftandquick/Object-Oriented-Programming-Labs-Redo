package Lecture17Part5;

/** This is a multidimensional array, depicting a 10 x 6 interest table. */
public class InterestTable {

	public static void main(String args[]) {
		
		/** Row is years, column is rate.  */
		double[][] interestTable = new double[10][6];
		
		for (int row = 0; row < interestTable.length; row++) {
			for (int column = 0; column < interestTable[row].length; column++) {
				interestTable[row][column] = balance(1000.00, row + 1, (5 + 0.5 * column));
			}
		}
		
		printTable(interestTable);
		
	}

	public static double balance(double startBalance, int years, double rate) {
		return startBalance * Math.pow((1 + rate / 100), years);
	}
	
	private static void printTable(double[][] table) {
		
		System.out.print("Years\t");

		double interestRate = 5.00;
		
		for (int c = 0; c < table[0].length; c++) {
			System.out.print(interestRate + "%\t");
			interestRate = interestRate + 0.50;
		}
		
		System.out.println();
		
		for (int r = 0; r < table.length; r++) {
			System.out.print((r + 1) + "\t"); 
			for (int c = 0; c < table[r].length; c++) {
				System.out.print("$" + (int) table[r][c] + "\t");
			}
			System.out.println();
		}
	}
	
}

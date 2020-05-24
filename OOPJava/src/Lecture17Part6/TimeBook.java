package Lecture17Part6;

public class TimeBook {

	public static void main(String args[]) {
		
		String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

		int[][] timebook = { {8, 0, 9}, {8, 0, 9}, {8, 8, 8}, {8, 8, 4}, {8, 8, 8} };
		
		printTable(timebook, days);
		
	}
	
	public static void printTable(int[][] rTimebook, String[] rDays) {
		System.out.println("Employee\t1\t2\t3\tTotal\t");
		for (int row = 0; row < rTimebook.length; row++) {
			System.out.print(rDays[row]);
			// For Monday, Tuesday, and Friday.  
			if (rDays[row].length() <= 7) {
				System.out.print("\t\t");
			}
			// For Wednesday and Thursday.  
			else {
				System.out.print("\t");
			}
			for (int column = 0; column < rTimebook[row].length; column++) {
				System.out.print(rTimebook[row][column] + "\t"); 
			}
			System.out.println(rowTotal(rTimebook[row]) + "\t");
		}
		
		System.out.print("Total\t\t");
		int[] lastRow = columnTotal(rTimebook);
		
		for (int i = 0; i < lastRow.length; i++) {
			System.out.print(lastRow[i] + "\t");
		}
		
		int total = 0;
		for (int i = 0; i < lastRow.length; i++) {
			total = total + lastRow[i];
		}
		System.out.print(total + "\t");
		
	}
	
	public static int rowTotal(int[] timebookRow) {
		int sum = 0;
		for (int i = 0; i < timebookRow.length; i++) {
			sum = sum + timebookRow[i];
		}
		return sum;
	}
	
	public static int[] columnTotal(int[][] rTimebook2) {
		int[] finalRow = new int[rTimebook2[0].length];
		for (int i = 0; i < finalRow.length; i++) {
			for (int row = 0; row < rTimebook2.length; row++) {
				finalRow[i] = finalRow[i] + rTimebook2[row][i];
			}
		}
		return finalRow;
		
	}
	
}

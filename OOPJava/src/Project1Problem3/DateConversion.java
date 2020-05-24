package Project1Problem3;

import java.util.Scanner;

public class DateConversion {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
				
		String USA_DATE;
		String EU_DATE;
		
		System.out.print("Enter the date in American format (MM/DD/YYYY):  ");
		USA_DATE = input.nextLine();
		System.out.println("USA Date:  " + USA_DATE);
		
		// EU Date is DD/MM/YYYY. 
		EU_DATE = USA_DATE.substring(3, 6) + USA_DATE.substring(0, 3) + USA_DATE.substring(6);
		System.out.println("EU Date:  " + EU_DATE);
		
		input.close();
		
	}
	
}

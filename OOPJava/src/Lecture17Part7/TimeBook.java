package Lecture17Part7;

/** An alternate version to print out the time table.  */

public class TimeBook {

	private int numberOfEmployees;
	
	/** hours[i][j] has the hours for employee j on day i.  */
	private int[][] hours;
	
	/** weekHours[i] has the week's hours worked for employee i + 1.  */
	private int[] weekHours;
	
	/** dayHours[i] has the total hours worked by all employees on day i.  */
	private int[] dayHours; 
	
	/** Set values MON to FRI as 0 to 4.  */
	private static final int NUMBER_OF_WORKDAYS = 5;
	private static final int MON = 0;
	private static final int TUE = 1;
	private static final int WED = 2;
	private static final int THU = 3;
	private static final int FRI = 4;
	
	public static void main(String[] args) {
		// Supposed to be declared as private static final int, but it will result in error.  
		final int NUMBER_OF_EMPLOYEES = 3; 
		TimeBook book = new TimeBook(NUMBER_OF_EMPLOYEES);
		book.setHours();
		book.update();
		book.showTable();
	}
	
	/** 
	 * Creates a constructor for the TimeBook class, it contains:  
	 * numberOfEmployees:  The number of employees.  
	 * hours:  A 2d that represents a table on how many hours an employee work on that day.  
	 * weekHours:  The number of hours an employee work for on that week, last column.  
	 * dayHours:  The number of hours all employees work for on that day, last row.  
	 */
	TimeBook(int theNumberOfEmployees) {
		numberOfEmployees = theNumberOfEmployees;
		hours = new int[NUMBER_OF_WORKDAYS][numberOfEmployees];
		weekHours = new int[numberOfEmployees];
		dayHours = new int[NUMBER_OF_WORKDAYS];
	}
	
	/**
	 * This is a stub. Set up the array elements in the hours[][] 2D array. Although
	 * some values are 0 to begin with, so they don't need to be set. For example,
	 * not setting hours[0][1] will have the same result since hours[0][1] is
	 * already initialized as 0.
	 */
	public void setHours() {
		hours[0][0] = 8; hours[0][1] = 0; hours[0][2] = 9; 
		hours[1][0] = 8; hours[1][1] = 0; hours[1][2] = 9; 
		hours[2][0] = 8; hours[2][1] = 8; hours[2][2] = 8; 
		hours[3][0] = 8; hours[3][1] = 8; hours[3][2] = 4; 
		hours[4][0] = 8; hours[4][1] = 8; hours[4][2] = 8; 
	}
	
	/** It's not really needed, I can just put the two compute methods in the main method.  */
	public void update() {
		computeWeekHours();
		computeDayHours();
	}
	
	/** Get the value of the total number of hours an employee worked in a week.  */
	public void computeWeekHours() {
		for (int employeeNumber = 1; employeeNumber <= numberOfEmployees; employeeNumber++) {
			int sum = 0;
			/** MON to FRI are assigned the values of 0 to 4.  */
			for (int day = MON; day <= FRI; day++) {
				/**
				 * Sum contains the sum of all hours worked in one week by the employee with
				 * number employeeNumber.  Here, I subtract the second index by 1 is because 
				 * index number is always one less than the associated employeeNumber.  For 
				 * example, employee number 2 is in index 1.  
				 */
				sum = sum + hours[day][employeeNumber - 1];
			}
			weekHours[employeeNumber - 1] = sum;
		}
	}
	
	/** Get the value of the total number of hours all employees work a day.  */
	private void computeDayHours() {
		for (int day = MON; day <= FRI; day++) {
			int sum = 0;
			for (int employeeNumber = 1; employeeNumber <= numberOfEmployees; employeeNumber++) {
				/** Sum contains the sum of all hours worked by all employees on one day.  */
				sum = sum + hours[day][employeeNumber - 1];
			}
			dayHours[day] = sum;
		}
	}
	
	/** Craft a table based on the three previous arrays.  */
	public void showTable() {
		/** Heading.  */
		System.out.print("Employee");
		for (int employeeNumber = 1; employeeNumber <= numberOfEmployees; employeeNumber++) {
			System.out.print(employeeNumber + " ");
		}
		System.out.println("Totals");
		System.out.println();
		
		/** Row entries.  */
		for (int day = MON; day <= FRI; day++) {
			System.out.print(getDayName(day) + " "); // Monday to Friday.  
			for (int column = 0; column < hours[day].length; column++) {
				System.out.print(hours[day][column] + " ");
			}
			System.out.println(dayHours[day]);
		}
		
		System.out.println();
		System.out.print("Total = ");
		for (int column = 0; column < numberOfEmployees; column++) {
			System.out.print(weekHours[column] + " ");
		}
		System.out.println();
		
	}
	
	/** Passes in the day in numerical value, then gets the string.  */
	private String getDayName(int day) {
		String dayName = null;
		switch(day) {
			case MON:
				dayName = "Monday";
				break;
			case TUE:
				dayName = "Tuesday";
				break;
			case WED:
				dayName = "Wednesday";
				break;
			case THU: 
				dayName = "Thursday";
				break;
			case FRI:
				dayName = "Friday";
				break;
			default: 
				System.out.println("Fatal error.  ");
				System.exit(0);
				break;
		}
		
		return dayName;
	}
	
}

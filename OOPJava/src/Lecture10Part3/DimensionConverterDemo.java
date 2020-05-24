package Lecture10Part3;

import java.util.Scanner;

public class DimensionConverterDemo {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a measurement in inches:  ");
		float inches = input.nextFloat();
		DimensionConverter inToFt = new DimensionConverter();
		inToFt.setInches(inches);
		System.out.println(inches + " inches = " + inToFt.inchesToFeet() + " feet.  ");
		
		System.out.print("Enter a measurement in feet:  ");		
		float feet = input.nextFloat();
		DimensionConverter ftToIn = new DimensionConverter();
		ftToIn.setFeet(feet);
		System.out.println(feet + " feet = " + ftToIn.feetToInches() + " inches.  "); 

		input.close();
		
	}
	
}
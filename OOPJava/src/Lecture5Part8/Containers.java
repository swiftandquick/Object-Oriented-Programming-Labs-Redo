package Lecture5Part8;

import java.util.Scanner;

public class Containers {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("How many pints are there?  ");
		int totalPints = input.nextInt();
		int remainder; 
		
		int gallons = totalPints / 8;
		remainder = totalPints % 8;
		
		int quarts = remainder / 2;
		remainder = remainder % 2;

		int pints = remainder / 1;
		remainder = remainder % 1;
		
		System.out.print(totalPints + " pints should use \n"
				+ gallons + " gallon containers, "
				+ quarts + " quarts containers, and "
				+ pints + " pints containers.  ");
		
		input.close();
		
	}
	
}

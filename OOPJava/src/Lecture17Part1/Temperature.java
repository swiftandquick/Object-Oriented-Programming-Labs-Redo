package Lecture17Part1;

import java.util.Scanner;

public class Temperature {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		int number;
		double sum = 0;
		double average;
		
		System.out.println("How many temperatures do you have?  ");
		number = input.nextInt();
		System.out.println("Enter " + number + " temperatures:  ");

		double[] temperatures = new double[number];
		
		for (int i = 0; i < temperatures.length; i++) {
			temperatures[i] = input.nextDouble();
			sum = sum + temperatures[i];
		}
		
		average = sum / number;
		
		for (int i = 0; i < temperatures.length; i++) {
			if (temperatures[i] > average) {
				System.out.println(temperatures[i] + ":  above average.");
			}
			else if (temperatures[i] < average) {
				System.out.println(temperatures[i] + ":  below average.");
			}
			else { // In case of temperatures[i] = equals.  
				System.out.println(temperatures[i] + ":  equal to average.");
			}
		}
		
		System.out.println("Have a nice week.");
		
		input.close();
		
	}
	
}

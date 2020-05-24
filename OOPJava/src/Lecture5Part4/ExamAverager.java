package Lecture5Part4;

import java.util.Scanner;

public class ExamAverager {

	public static void main(String[] args) {
		
		System.out.println("This program computes the average of ");
		System.out.println("a list of (non-negative) exam scores.  ");
		
		double sum; 
		double average; 
		int numberOfStudents;
		double next;
		String answer; 
		
		Scanner input = new Scanner(System.in);
		
		do {
			// Reset these variables every time it loops.  
			
			System.out.println("Enter all the scores to be averaged.  "
					+ "\nEnter a negative number after "
					+ "\nyou have entered all the scores.  ");

			sum = 0; 
			numberOfStudents = 0; 
			
			next = input.nextDouble();
			// Insert negative number to terminate the inner while loop.  
			while (next >= 0) {
				sum = sum + next;
				numberOfStudents++;
				next = input.nextDouble();
			}
			
			average = sum / numberOfStudents;  
			System.out.println("The average is " + average);

			System.out.println("Want to average another exam?  "
					+ "\nEnter yes or no.  ");
			answer = input.next();
			// answer = input.nextLine(); doesn't work!  
			
		} while(answer.equalsIgnoreCase("yes"));
		
		input.close();
		
	}
	
}

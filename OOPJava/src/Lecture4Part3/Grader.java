package Lecture4Part3;

import java.util.Scanner;

public class Grader {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your score:  ");
		int score = input.nextInt();
		char grade = 'A'; 
		// Initialized grade as 'A', no initialization cause code error.  
		
		if (score >= 90 && score <= 100) {
			grade = 'A';
		}
		else if (score >= 80 && score <= 89) {
			grade = 'B';
		}
		else if (score >= 70 && score <= 79) {
			grade = 'C';
		}
		else if (score >= 60 && score <= 69) {
			grade = 'D';
		}
		else if (score <= 59 && score >= 0) {
			grade = 'F';
		}
		else {
			System.out.println("Invalid input!  ");
			System.exit(0); // Exit out of the program.  
		}
		
		System.out.println("Score = " + score);
		System.out.println("Grade = " + grade);
		
		input.close();
		
	}
	
}

package Lecture17Part2;

import java.util.Scanner;

public class ExamScore {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your score on exam 1:  ");
		double firstScore = input.nextDouble(); 
		
		double[] nextScores = new double[3];
		
		for (int i = 0; i < nextScores.length; i++) {
			nextScores[i] = firstScore + i * 5;
		}

		double[] averageScores = possibleAverages(firstScore, nextScores);
		
		for (int i = 0; i < nextScores.length; i++) {
			System.out.println("If your score on exam 2 is " + nextScores[i]);
			System.out.println("Your average will be " + averageScores[i]);
		}
		
		input.close();
		
	}
	
	public static double average(double e1Score, double e2Score) {
		return (e1Score + e2Score) / 2;
	}
	
	public static double[] possibleAverages(double rFirstScore, double[] rNextScores) {
		double[] averages = new double [rNextScores.length];
		for (int i = 0; i < averages.length; i++) {
			averages[i] = average(rFirstScore, rNextScores[i]);
		}
		return averages;
	}
	
}

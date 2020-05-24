package Lecture5Part7;

import java.util.Scanner;

public class SumOfSquares {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int sumOfSquares = 0;	
		
		for (int i = 1; i <= n; i++) {
			sumOfSquares = sumOfSquares + i * i;
		}
		
		System.out.println("The sum of squares is " + sumOfSquares);
		
		input.close();
		
	}
	
}

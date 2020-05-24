package Lecture5Part6;

public class SumAndProduct {

	public static void main(String args[]) {
		
		int sum = 0; 
		double product = 1; 
		int max = 20; 
		
		for (int i = 1; i <= max; i++) {
			sum = sum + i;
			product = product * i;
		}
		
		System.out.println("The sum is " + sum + 
				" and the product is " + product + ".  ");
		
	}
	
}

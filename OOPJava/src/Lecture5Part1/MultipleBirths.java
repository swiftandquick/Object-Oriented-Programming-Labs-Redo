package Lecture5Part1;

import java.util.Scanner;

public class MultipleBirths {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Enter the number of babies:  ");
		int babies = input.nextInt();
		
		switch(babies) { 
			case 1:
				System.out.println("Congratulations.  ");
				// Break is necessary, otherwise it will execute the cases below it.  
				break; 
			case 2: 
				System.out.println("Twins!  ");
				break;
			case 3:  
				System.out.println("Wow.  Triplets.  ");
				break;
			case 4: 
			case 5:  
				System.out.printf("Unbelievable; %d babies.  ", babies);
				break;
			default:  
				System.out.println("I don't believe you.  ");
				break;
		}
		
		input.close();
		
	}
	
}

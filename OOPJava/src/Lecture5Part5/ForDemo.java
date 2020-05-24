package Lecture5Part5;

import java.util.Scanner;

public class ForDemo {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("My number is:  ");
		int number = input.nextInt();
		
		for(int i = number; i >= 0; i--) {
			System.out.println(i + "\nand counting.  ");
		}
		System.out.println("Blast off!  ");
		
		input.close();
		
	}
	
}

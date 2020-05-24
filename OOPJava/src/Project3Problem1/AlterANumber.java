package Project3Problem1;

import java.util.Scanner;

public class AlterANumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter the initial value:  ");
		int value = input.nextInt();
		
		System.out.println("How would you like to adjust the value?  " + 
				"\n1.  Add one.  \n2.  Subtract one.  " + 
				"\n3.  Set it to zero.  \n4.  Get value.  ");
		
		int option = input.nextInt();
		
		switch(option) {
			case 1:  
				System.out.print("Add one:  ");
				value++; 
				System.out.println(value); 
				break;
			case 2:  
				System.out.print("Subtract one:  ");
				value--;
				System.out.println(value);
				break;
			case 3:  
				System.out.print("Set it to zero:  ");
				value = 0;
				System.out.println(value);
				break; 
			case 4:  
				System.out.print("Get value:  ");
				System.out.println(value);
				break;
			default:  
				System.out.println("Invalid input!  ");
				break;
		}
		
		input.close();
		
	}
	
}

package Project6Part1;

import java.util.Scanner;

public class TestCompany {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
				
		System.out.println("What is the company name?  ");
		String company = input.nextLine();
		
		/** Create an object called companyName.  */
		Company companyName = new Company();
		companyName.Company(company);
		
		/** Creates 2 customer objects.  */
		Customer customer1 = new Customer();
		Customer customer2 = new Customer();
		
		customer1.setDetails(); 
		customer2.setDetails();

		companyName.headline();
		customer1.sendBroadcast();
		customer2.sendBroadcast();
		
		input.close();
		
	}

}

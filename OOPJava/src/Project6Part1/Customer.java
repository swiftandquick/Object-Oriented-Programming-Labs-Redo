package Project6Part1;

import java.util.Scanner;

public class Customer {

	private int storedID;
	private String storedName;
	private String storedAddress;
	private String storedPhone;
	private String storedEmail;
	private String storedBeginDate;
	private String storedEndDate; 
	
	public void setDetails() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your ID:  ");
		this.storedID = input.nextInt();

		System.out.print("Enter your name:  ");
		this.storedName = input.next();
		
		System.out.print("Enter your address:  ");
		this.storedAddress = input.next();
		
		System.out.print("Enter your phone:  ");
		this.storedPhone = input.next(); 
		
		System.out.print("Enter your email:  ");
		this.storedEmail = input.next();
		
		System.out.print("Enter your begin date:  ");
		this.storedBeginDate = input.next();
		
		System.out.print("Enter your end date:  ");
		this.storedEndDate = input.next(); 
		
	}
	
	public void sendBroadcast() {
		System.out.println("Receiver:  " + storedEmail);
		System.out.println("ID:  #" + storedID);
		System.out.println("Dear " + storedName + ", ");
		System.out.println("\tThanks for purchasing our product, we will send our product to your address between " + storedBeginDate + " and "
				+ storedEndDate + ".  In our record, your current address is " + storedAddress + ".  If you dont get the product, our employees "
				+ "will call you, your phone number is " + storedPhone + ".  Thanks for purchasing our product, have a nice day.  ");
	} 
	
}

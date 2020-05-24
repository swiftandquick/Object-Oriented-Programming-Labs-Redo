package Lecture7Part3;

public class LocalVariableDemoProgram {

	public static void main(String[] args) {
		/** Creates an object called myAccount.  
		 * The object myAccount stores its information 
		 * in the instance variables of the BankAccount class.  
		 */
		BankAccount myAccount = new BankAccount();
		myAccount.amount = 100.00;
		myAccount.rate = 5;
		
		/** myAccount object calls showNewBalance() method.  */
		myAccount.showNewBalance();
		
		double newAmount = 800.00;
		System.out.println("I wish my new amount were $" + newAmount);
	}
	
}

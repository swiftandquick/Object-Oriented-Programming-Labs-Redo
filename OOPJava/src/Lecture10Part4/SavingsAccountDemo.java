package Lecture10Part4;

public class SavingsAccountDemo {

	public static void main(String args[]) {
		
		SavingsAccount ourAccount = new SavingsAccount();
		ourAccount.setData(10.75, 75, 55, 15.75, 115.3925, 10.75, 2);
		ourAccount.writeOutput();
	}
	
}

package Lecture10Part4;

public class SavingsAccount {

	double storedIDeposit;
	double storedUDeposit;
	double storedUDeposit2;
	double storedUWithdraw;
	double storedUSavings; 
	double storedISavings;
	int storedAccounts; 
	
	public void setData(double iDeposit, double uDeposit, double uDeposit2, 
			double uWithdraw, double uSavings, double iSavings, int accounts) {
		this.storedIDeposit = iDeposit;
		this.storedUDeposit = uDeposit;
		this.storedUDeposit2 = uDeposit2;
		this.storedUWithdraw = uWithdraw;
		this.storedUSavings = uSavings;
		this.storedISavings = iSavings;
		this.storedAccounts = accounts; 
	}
	
	public void writeOutput() {
		System.out.println("I deposited $" + storedIDeposit + ".  "); 
		System.out.println("You deposited $" + storedUDeposit + ".  "); 
		System.out.println("You deposited $" + storedUDeposit2 + ".  "); 
		System.out.println("You withdrew $" + storedUWithdraw + ".  "); 
		System.out.println("You received interest.  "); 
		System.out.println("Your savings is " + storedUSavings + ".  ");
		System.out.println("My savings is " + storedISavings + ".  ");
		System.out.println("We opened " + storedAccounts + " savings accounts today.  ");
	}

}

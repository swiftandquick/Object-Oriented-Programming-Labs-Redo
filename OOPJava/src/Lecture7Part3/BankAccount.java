package Lecture7Part3;

public class BankAccount {

	public double amount;
	public double rate;
	public void showNewBalance() {
		double newAmount = amount + (rate / 100.0) * amount;
		System.out.println("With interest added, the new amount is $" + newAmount);
	}

}

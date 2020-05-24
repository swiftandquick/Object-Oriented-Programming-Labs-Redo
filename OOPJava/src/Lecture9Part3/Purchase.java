package Lecture9Part3;

public class Purchase {

	private String storedItemName; 
	private int storedFixNumber;
	private double storedFixPrice; 
	private int storedNumberOfItems;
	private double costOfEach;
	private double totalCost;
	
	public void setPurchase(String retrievedItemName, int retrievedFixNumber, double retrievedFixPrice, int retrievedNumberOfItems) {
		this.storedItemName = retrievedItemName; 
		this.storedFixNumber = retrievedFixNumber;
		this.storedFixPrice = retrievedFixPrice;
		this.storedNumberOfItems = retrievedNumberOfItems;
	}
	
	/** Add an "s" if there are multiple items.  */
	public String getItemName() {
		if (storedNumberOfItems > 1){
			return storedItemName + "s"; 
		}
		else {
			return storedItemName;
		}
	}
	
	public int getFixNumber() {
		return storedFixNumber; 
	}
	
	public double getFixPrice() {
		return storedFixPrice; 
	}
	
	public int getNumberOfItems() {
		return storedNumberOfItems;
	}

	public double getCostOfEach() {
		costOfEach = storedFixPrice / (double) storedFixNumber; 
		return costOfEach;
	}
	
	public double getTotalCost() {
		totalCost = costOfEach * (double) storedNumberOfItems;
		return totalCost;
	}
	
}

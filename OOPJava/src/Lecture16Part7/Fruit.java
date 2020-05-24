package Lecture16Part7;

/**
 * To make sort an object by its property, I have to make the Object implement
 * the Comparable interface, then override the compareTo() method.
 */
public class Fruit implements Comparable<Fruit> {
	
	private String fruitName;
	private String fruitDesc;
	private int quantity;
	
	public Fruit(String rFruitName, String rFruitDesc, int rQuantity) {
		fruitName = rFruitName;
		fruitDesc = rFruitDesc;
		quantity = rQuantity; 
	}
	
	public String getFruitName() {
		return fruitName;
	}
	
	public void setFruitName(String rFruitName) {
		this.fruitName = rFruitName;
	}
	
	public String getFruitDesc() {
		return fruitDesc;
	}
	
	public void setFruitDesc(String rFruitDesc) {
		this.fruitDesc = rFruitDesc; 
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int rQuantity) {
		this.quantity = rQuantity;  
	}

	@Override
	public int compareTo(Fruit another) {
		// Ascending order.  
		return this.quantity - another.quantity;
		
		// Descending order.  I can either have this or the above.  
		// return another.quantity - this.quantity; 
	}
	
}

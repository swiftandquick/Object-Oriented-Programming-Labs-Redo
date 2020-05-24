package Project5;

public class CustomerDemo {

	public static void main(String args[]) {
		
		/** Creates two objects.  */
		Customer customer1 = new Customer();
		Customer customer2 = new Customer();
		
		/** Sets attributes each of the two objects.  Passes information to the constructor.  */
		customer1.setData(100, "John B. Smith", "19 Magnate St., Boston, MA, USA", 
				"1-857-654-0120", "johnsmith13@gmail.com", "01/13/2015", "01/15/2015");
		customer2.setData(101, "Whitney H. White", "14 Water St., Quincy, MA, USA", 
				"1-535-757-7531", "whitneyhuston14@gmail.com", "01/19/2015", "01/21/2015");
		
		System.out.println("Customer 1:  ");
		customer1.writeOutput();
		
		System.out.println("Customer 2:  ");
		customer2.writeOutput();
		
	}
	
}

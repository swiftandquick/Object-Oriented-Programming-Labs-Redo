package Project5;

public class Customer {

	int id;
	String name, address, phone, email, beginDate, endDate; 
	
	/** Constructors gets the parameter variables, then sets local variables equal to variables from the parameter.  */
	public void setData(int getId, String getName, String getAddress, 
			String getPhone, String getEmail, String getBeginDate, String getEndDate) {
		this.id = getId; 
		this.name = getName; 
		this.address = getAddress; 
		this.phone = getPhone; 
		this.email = getEmail; 
		this.beginDate = getBeginDate; 
		this.endDate = getEndDate; 
	}
	
	public void writeOutput() {
		System.out.println("Receiver:  " + email 
				+ "\nDear " + name + ":  "
				+ "ID #:  " + id
				+ "\n\tThanks for purchasing our product, we will send our product to your address between " + 
				beginDate + " and " + endDate + ".  In our record, your current address is \n" + address + ".  "
				+ "If you don't get the product, our employees will call you, as your phone number is " + phone + 
				"Thanks for purchasing our \nproduct!  "); 
	}

}

package Project6Part1;

public class Company {

	private String companyName; 
	private String CEO; 
	private int yearsOfHistory;
	
	/** Default constructor.  Stores attributes of an object.  */
	Company() {
		companyName = ""; 
		CEO = ""; 
		yearsOfHistory = 0; 
	}
	
	/** Use the constructor to update the companyName value.  */
	public void Company(String retrievedCompanyName) {
		this.companyName = retrievedCompanyName; 
	}

	public void headline() {
		System.out.println("This is a message from " + companyName + " to all customers!  "  );
	}
	
}

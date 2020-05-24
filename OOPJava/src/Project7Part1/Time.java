package Project7Part1;

public class Time {

	private int storedHour, storedMinute; 
	private boolean storedIsAM; 
	
	Time () {
		storedHour = 0;
		storedMinute = 0;
	}

	/** Supposed to be private.  */
	public boolean isValid(int retrievedHour, int retrievedMinute) {
		if (retrievedHour < 0 || retrievedHour > 23 || 
				retrievedMinute < 0 || retrievedMinute > 59) {
			return false;
		}
		else {
			return true;
		}
	}

	public void setTime(int retrievedHour, int retrievedMinute) {
		this.storedHour = retrievedHour; 
		this.storedMinute = retrievedMinute; 
	}
	
	public void setTime(int retrievedHour, int retrievedMinute, boolean retrievedIsAM) {
		this.storedHour = retrievedHour; 
		this.storedMinute = retrievedMinute; 
		this.storedIsAM = retrievedIsAM; 
		if (storedHour == 0) {
			storedHour = 12; 
		}
		// Hour cannot be greater than 13.  
		else if (storedHour >= 13) {
			storedHour = storedHour % 12;
		}
	}
	
	public String getTime24() {
		return "24 Hour Clock:  " + Integer.toString(storedHour) + ":" + Integer.toString(storedMinute);
	}
	
	public String getTime12() {
		if (storedIsAM == true) {
			return "12 Hour Clock:  " + Integer.toString(storedHour) + ":" + Integer.toString(storedMinute) + " AM";
		}
		else {
			return "12 Hour Clock:  " + Integer.toString(storedHour) + ":" + Integer.toString(storedMinute) + " PM";
		}
	}
	
}
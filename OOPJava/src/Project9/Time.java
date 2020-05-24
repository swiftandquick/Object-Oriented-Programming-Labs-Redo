package Project9;

public class Time {
	
	private int hour, minute;
	
	/** Default constructor.  */
	Time() {
		hour = 0;
		minute = 0;
	}
	
	Time(int rHour, int rMinute) {
		hour = rHour;
		minute = rMinute;
	}
	
	public int getHour() {
		return hour;
	}
	
	public void setHour(int rHour) {
		this.hour = rHour;
	}
	
	public int getMinute() {
		return minute; 
	}
	
	public void setMinute(int rMinute) {
		this.minute = rMinute; 
	}
	
	/** Get time in 12 hours format:  hh:mm (am/pm).  */
	public String getTimeIn12() {
		String timeIn12 = "";
		int hourIn12;
		
		if (hour == 0) {
			hourIn12 = 12;
		}
		else if (hour > 12) {
			hourIn12 = hour % 12;
		}
		else {
			hourIn12 = hour;
		}
		
		if (hourIn12 <= 9) {
			timeIn12 = timeIn12 + "0" + hourIn12 + ":";
		}
		else {
			timeIn12 = timeIn12 + hourIn12 + ":";
		}
		if (minute <= 9) {
			timeIn12 = timeIn12 + "0" + minute;
		}
		else {
			timeIn12 = timeIn12 + minute;
		}
		
		if (isAM()) {
			timeIn12 = timeIn12 + " am";
		}
		else {
			timeIn12 = timeIn12 + " pm";
		}
		
		return timeIn12;
	}
	
	public boolean isAM() {
		if (hour <= 11) {
			return true;
		}
		else {
			return false; 
		}
	}
	
	public boolean validTest() {
		if (hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59) {
			return true; 
		}
		else {
			/** Set hour and minute to 0 if test is invalid.  */
			hour = 0;
			minute = 0;
			return false; 
		}
	}
	
	/** Get the format hhmm.  */
	public String numberFormat() {
		String numberForm = "";
		if (hour <= 9) {
			numberForm = numberForm + "0" + hour;
		}
		else {
			numberForm = numberForm + hour;
		}
		if (minute <= 9) {
			numberForm = numberForm + "0" + minute;
		}
		else {
			numberForm = numberForm + minute; 
		}
		return numberForm;
	}
	
	public void testResult() {
		System.out.print("Testing " + "(" + hour + ", " + minute + "):  ");
		if (validTest()) {
			System.out.println("Valid test!");
		}
		else {
			System.out.println("Error test!");
		}
		System.out.println("Result:  " + "(" + hour + ", " + minute + ")    " + numberFormat() + "    " + getTimeIn12());
	}
	
}
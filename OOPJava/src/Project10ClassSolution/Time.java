package Project10ClassSolution;

public class Time {
	private int hours;
	private int minutes;

	/**
	 * 
	 * <p>
	 * postconditions: No error case, it always set it as zero.
	 */

	public Time() {
		hours = 0;
		minutes = 0;
	}

	/**
	 * 
	 * Creates and initializes a Time object given the time in 24-hour format
	 * 
	 * @param initialHours
	 *            24-hour format in the range 0...23
	 * @param initialMinutes
	 *            60-minute format in range 0...59
	 *            <p>
	 *            postconditions: If the specified hours and minutes are
	 *            in-range, the object will recall the parameter but the time
	 *            will be set to 0 hours and 0 minutes (12:00 midnight) if
	 *            either or both values are out of range
	 */

	public Time(int initialHours, int initialMinutes) {
		setTime(initialHours, initialMinutes);
	}

	/**
	 * 
	 * Creates and initializes a Time object given the time in 12-hour format
	 * 
	 * @param initialHours
	 *            24-hour format in the range 0...12
	 * @param initialMinutes
	 *            60-minute format in range 0...59
	 * @param isAM
	 *            is a boolean, if hours <= 12, isAM is am, if hours > 12, isAM
	 *            is not am
	 *            <p>
	 *            postconditions: If the specified hours and minutes are
	 *            in-range, the object will recall the parameter but the time
	 *            will be set to 0 hours and 0 minutes (12:00 midnight) if
	 *            either or both values are out of range
	 */

	public Time(int initialHours, int initialMinutes, boolean isAM) {
		setTime(initialHours, initialMinutes, isAM);
	}

	/**
	 * 
	 * Creates an accessor that gets the 12-hour time
	 * <p>
	 * postconditions:
	 */

	public String getTime12() {
//		String response = "";
//
//		if (hours == 0)
//			response = "12";
//		else if (hours > 12)
//			response = response + (hours - 12);
//		else
//			response = response + hours;
//
//		response = response + ":";
//
//		if (minutes < 10)
//			response = response + "0" + minutes;
//		else
//			response = response + minutes;
//
//		if (hours >= 0 && hours < 11)
//			response = response + " am";
//		else
//			response = response + " pm";
//
//		return response;
		String AMorPM;
		int displayHours;
		
		if (hours == 0) {
			AMorPM = "am";
			displayHours = 12;
		}
		else if(hours < 12) {
			AMorPM = "am"; 
			displayHours = hours;
		}
		else { // if hour > 12
			AMorPM = "pm"; 	
			if (hours == 12) {
				displayHours = 12; }
			else {
				displayHours = hours - 12; 
			}
		}
		return String.format("%02d:%02d %s", displayHours, minutes, AMorPM);
	}

	/**
	 * 
	 * Creates an accessor that gets the 24-hour time
	 * <p>
	 * postconditions:
	 */

	public String getTime24() {
		//		CTRL+7 = toggle comment (//)
		//		String response = "";
		//		if (hours < 10)
		//			response = "0" + hours;
		//		else
		//			response = "" + hours;
		//
		//		if (minutes < 10)
		//			response = response + "0" + minutes;
		//		else
		//			response = response + minutes;
		//
		//		return response;
		//		Display hours and minutes in 2 significant digits
		return String.format("%02d%02d", 
				hours, 
				minutes);
	}

	/**
	 * 
	 * Creates an mutator that sets the 24-hour time
	 * <p>
	 * postconditions:
	 */

	public void setTime(int newHours, int newMinutes) {
		if (isValid(newHours, newMinutes)) {
			hours = newHours;
			minutes = newMinutes;
		}
	}

	/**
	 * 
	 * Creates an accessor that sets the 12-hour time
	 * <p>
	 * postconditions:
	 */

	public void setTime(int newHours, int newMinutes, boolean isAM) {
		if (newHours >= 1 && newHours <= 12) {
			if (isAM && newHours == 12) {
				// 12AM is 0 hours.
				newHours = 0;
			} else if (!isAM && newHours < 12) {
				// 8PM is 20 hours
				newHours = newHours + 12;
			}
			// The remaining hours are unchanged
			// 11AM is 11 hours, 12PM is 12 hours

			if (isValid(newHours, newMinutes)) {
				hours = newHours;
				minutes = newMinutes;
			}
		}
	}

	/**
	 * 
	 * Creates an mutator that gets the 12-hour time
	 * <p>
	 * postconditions:
	 */
	@Override
	public String toString() {
		return String.format("(%02d, %02d)", hours, minutes);
	}

	/**
	 * 
	 * Creates a boolean method to check whether the hours and minutes are in
	 * range.
	 * <p>
	 * postconditions:
	 */
	private boolean isValid(int timeHours, int timeMinutes) {
		return (timeHours >= 0 && timeHours <= 23) && (timeMinutes >= 0 && timeMinutes <= 59);
	}

	/**
	 * 
	 * Compares actual time and expected time.
	 * <p>
	 * postconditions:
	 */
	private static void displayTest(boolean isValid, String testDescription, Time testTime, String expectedRawTime,
			String expected24HourTime, String expected12HourTime) {
		System.out.println((isValid ? "Valid" : "Error") + " test: " + testDescription);
		displayTestExpected(expectedRawTime, expected24HourTime, expected12HourTime);
		displayTestActual(testTime);
		System.out.println();
	}

	/**
	 * 
	 * Prints actual time.
	 * <p>
	 * postconditions:
	 */
	private static void displayTestActual(Time testTime) {
		System.out.printf("Actual:\t%10s\t%s\t%s\n", testTime, testTime.getTime24(), testTime.getTime12());
	}

	/**
	 * 
	 * Prints expected time.
	 * <p>
	 * postconditions:
	 */
	private static void displayTestExpected(String expectedRawTime, String expected24HourTime,
			String expected12HourTime) {
		System.out.printf("Expect:\t%10s\t%s\t%s\n", expectedRawTime, expected24HourTime, expected12HourTime);
	}

	/**
	 * 
	 * Main method, prints all the test results.
	 * <p>
	 * postconditions:
	 */
	public static void main(String[] args) {
		final boolean AM = true;
		final boolean PM = false;

		final boolean VALID_TEST = true;
		final boolean ERROR_TEST = false;

		Time testTime;

		testTime = new Time();
		displayTest(VALID_TEST, "new Time()", testTime, "(00, 00)", "0000", "12:00 am");

		testTime = new Time(0, 0);
		displayTest(VALID_TEST, "new Time( 00, 00 )", testTime, "(00, 00)", "0000", "12:00 am");

		testTime = new Time(-1, 1);
		displayTest(ERROR_TEST, "new Time( -1, 01 )", testTime, "(00, 00)", "0000", "12:00 am");

		testTime = new Time(1, -1);
		displayTest(ERROR_TEST, "new Time( 01, -1 )", testTime, "(00, 00)", "0000", "12:00 am");

		testTime = new Time(24, 1);
		displayTest(ERROR_TEST, "new Time( 24, 01 )", testTime, "(00, 00)", "0000", "12:00 am");

		testTime = new Time(1, 60);
		displayTest(ERROR_TEST, "new Time( 01, 60 )", testTime, "(00, 00)", "0000", "12:00 am");

		testTime = new Time(0, 19);
		displayTest(VALID_TEST, "new Time( 00, 19 )", testTime, "(00, 19)", "0019", "12:19 am");

		testTime = new Time(3, 5);
		displayTest(VALID_TEST, "new Time( 03, 05 )", testTime, "(03, 05)", "0305", "3:05 am");

		testTime = new Time(12, 1);
		displayTest(VALID_TEST, "new Time( 12, 01 )", testTime, "(12, 01)", "1201", "12:01 pm");

		testTime = new Time(12, 1, AM);
		displayTest(VALID_TEST, "new Time( 12, 01, AM )", testTime, "(00, 01)", "0001", "12:01 am");

		testTime = new Time(12, 1, PM);
		displayTest(VALID_TEST, "new Time( 12, 01, PM )", testTime, "(12, 01)", "1201", "12:01 pm");

		testTime = new Time(3, 45, AM);
		displayTest(VALID_TEST, "new Time( 03, 45, AM )", testTime, "(03, 45)", "0345", "3:45 am");

		testTime = new Time(3, 45, PM);
		displayTest(VALID_TEST, "new Time( 03, 45, PM )", testTime, "(15, 45)", "1545", "3:45 pm");

		testTime = new Time(3, 45);
		displayTest(VALID_TEST, "new Time( 03, 45 )", testTime, "(03, 45)", "0345", "3:45 am");

		testTime = new Time(15, 45);
		displayTest(VALID_TEST, "new Time( 15, 45 )", testTime, "(15, 45)", "1545", "3:45 pm");

		testTime.setTime(12, 21);
		displayTest(VALID_TEST, "setTime( 12, 21 )", testTime, "(12, 21)", "1221", "12:21 pm");

		testTime.setTime(-1, 13);
		displayTest(ERROR_TEST, "setTime( -1, 13 )", testTime, "(12, 21)", "1221", "12:21 pm");

		testTime.setTime(13, -1);
		displayTest(ERROR_TEST, "setTime( 13, -1 )", testTime, "(12, 21)", "1221", "12:21 pm");

		testTime.setTime(24, 42);
		displayTest(ERROR_TEST, "setTime( 24, 42 )", testTime, "(12, 21)", "1221", "12:21 pm");

		testTime.setTime(6, 60);
		displayTest(ERROR_TEST, "setTime( 06, 60 )", testTime, "(12, 21)", "1221", "12:21 pm");

		testTime.setTime(8, 16, AM);
		displayTest(VALID_TEST, "setTime( 08, 16, AM )", testTime, "(08, 16)", "0816", "8:16 am");

		testTime.setTime(9, 17, PM);
		displayTest(VALID_TEST, "setTime( 09, 17, PM )", testTime, "(21, 17)", "2117", "9:17 pm");

		testTime.setTime(0, 15, AM);
		displayTest(ERROR_TEST, "setTime( 00, 15, AM )", testTime, "(21, 17)", "2117", "9:17 pm");

		testTime.setTime(13, 14, AM);
		displayTest(ERROR_TEST, "setTime( 13, 14, AM )", testTime, "(21, 17)", "2117", "9:17 pm");

		testTime.setTime(0, 13, PM);
		displayTest(ERROR_TEST, "setTime( 00, 13, PM )", testTime, "(21, 17)", "2117", "9:17 pm");

		testTime.setTime(13, 12, PM);
		displayTest(ERROR_TEST, "setTime( 13, 12, PM )", testTime, "(21, 17)", "2117", "9:17 pm");

		testTime.setTime(12, 19, AM);
		displayTest(VALID_TEST, "setTime( 12, 19, AM )", testTime, "(00, 19)", "0019", "12:19 am");

		testTime.setTime(11, 14, PM);
		displayTest(VALID_TEST, "setTime( 11, 14, PM )", testTime, "(23, 14)", "2314", "11:14 pm");

		testTime.setTime(11, 59, AM);
		displayTest(VALID_TEST, "setTime( 11, 59, AM )", testTime, "(11, 59)", "1159", "11:59 am");

		testTime.setTime(11, 59, PM);
		displayTest(VALID_TEST, "setTime( 11, 59, PM )", testTime, "(23, 59)", "2359", "11:59 pm");

	}
}

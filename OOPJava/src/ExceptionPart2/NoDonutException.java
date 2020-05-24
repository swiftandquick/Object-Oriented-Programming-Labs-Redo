package ExceptionPart2;

@SuppressWarnings("serial")
public class NoDonutException extends Exception {
	
	/** Default constructor.  */
	NoDonutException() {
	}
	
	/** Constructor with string.  */
	NoDonutException(String message) {
		super(message);
	}
	
}

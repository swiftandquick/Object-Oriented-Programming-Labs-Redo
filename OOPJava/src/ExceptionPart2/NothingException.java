package ExceptionPart2;

@SuppressWarnings("serial")
public class NothingException extends Exception {
	
	/** Default constructor.  */
	NothingException() {
	}
	
	/** Constructor with string.  */
	NothingException(String message) {
		super(message);
	}
	
}

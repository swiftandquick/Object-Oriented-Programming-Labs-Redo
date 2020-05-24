package ExceptionGraphics;

@SuppressWarnings("serial")
public class UnknownColorException extends Exception {

	/** Default constructor passes in default message.  */
	UnknownColorException() {
		super("Unknown color!  ");
	}
	
	/** Now message will display whatever message I pass in instead.  */
	UnknownColorException(String message) {
		super(message);
	}
	
}

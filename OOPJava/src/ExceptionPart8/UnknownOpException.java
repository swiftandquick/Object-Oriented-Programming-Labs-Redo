package ExceptionPart8;

@SuppressWarnings("serial")
public class UnknownOpException extends Exception {

	UnknownOpException() {
	}
	
	UnknownOpException(String message) {
		super(message);
	}
	
}

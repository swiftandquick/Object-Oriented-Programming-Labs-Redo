package ExceptionPart7;

@SuppressWarnings("serial")
public class NegativeNumberException extends Exception {

	NegativeNumberException() {
	}
	
	NegativeNumberException(String message) {
		super(message); 
	}
	
}

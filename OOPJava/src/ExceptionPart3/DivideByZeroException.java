package ExceptionPart3;

@SuppressWarnings("serial")
public class DivideByZeroException extends Exception {
	
	DivideByZeroException() {
	}
	
	DivideByZeroException(String message) {
		super(message);
	}
	
}

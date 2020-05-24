package ExceptionPart2;

/**
 * A customer exception that I defined, which is the subclass of Exception, a
 * pre-defined class.  Pre-defined exceptions usually have two constructors, 
 * one is default with no parameter, and the other with a string parameter.  
 */
@SuppressWarnings("serial")
public class NoMilkException extends Exception {
	
	/** Default constructor, which is what I usually call.  */
	NoMilkException() {
	}
	
	/**
	 * Inside the constructor with String, I call the constructor of parent class
	 * Exception, and passes in exception message to Exception's constructor.
	 */
	NoMilkException(String message) {
		super(message);
	}
	
}

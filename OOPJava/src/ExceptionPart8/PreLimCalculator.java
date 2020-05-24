package ExceptionPart8;

import java.util.InputMismatchException; 
import java.util.Scanner;

public class PreLimCalculator {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		double result = 0;
		char nextOperation = '+'; // Default as +, it will change.  
		double nextNumber;
		
		System.out.println("Calculator is on.  ");
		System.out.println("Format of each line:  operator space number");
		System.out.println("For example:  = 3");
		System.out.println("To end, end the letter e.  ");
		System.out.println("Result is reset to zero if input is invalid.  ");
		System.out.println("result = " + result);
		
		do {
			try {
				nextOperation = input.next().charAt(0);
				
				/** Calculator program ends if nextOperation is e or E.  */
				if (nextOperation == 'e' || nextOperation == 'E') {
					System.out.println("The final result is " + result);
					throw new UnknownOpException("Calculator program ending.  ");
				}
				
				nextNumber = input.nextDouble();
				switch (nextOperation) {
					case '+':
						result = result + nextNumber;
						getResult(result, nextOperation, nextNumber);
						break;
					case '-':
						result = result - nextNumber;
						getResult(result, nextOperation, nextNumber);
						break;
					case '*':
						result = result * nextNumber;
						getResult(result, nextOperation, nextNumber);
						break;
					case '/':
						try {
							result = division(result, nextNumber);
							getResult(result, nextOperation, nextNumber);
						}
						catch (DivideByZeroException e) {
							result = 0; // Result reset to 0 for invalid input. 
							System.out.println("updated result = " + result);
							System.out.println("Cannot divide by zero.  ");
						}
						break;
					default:
						result = 0; // Result reset to 0 for invalid input.  
						System.out.println("updated result = " + result);
						throw new UnknownOpException("Unknown operator, try again.  ");
				}
			}
			catch (UnknownOpException e) {
				System.out.println(e.getMessage());
			}
			/** Try to enter a number for second input, because this exception catch is buggy.  */
			catch (InputMismatchException e) {
				result = 0; // Result reset to 0 for invalid input.  
				System.out.println("updated result = " + result);
				System.out.println("Please a valid input.  ");
			}

		} while(!(nextOperation == ('e') || nextOperation == ('E')));
		
		System.out.println("< The End >");
		
		input.close();
		
	}
	
	private static void getResult(double rResult, char rNextOperation, double rNextNumber) {
		System.out.println("result " + rNextOperation + " " + rNextNumber + " = " + rResult);
		System.out.println("updated result = " + rResult);
	}

	public static double division(double rResult, double rNextNumber) throws DivideByZeroException {
		if (rNextNumber == 0) {
			throw new DivideByZeroException();
		}
		return rResult / rNextNumber;
	}
	
}
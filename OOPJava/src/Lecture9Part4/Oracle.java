package Lecture9Part4;

import java.util.Scanner;

/** This class is a series of method classing, method invoking only works within the same class.  Again, Scanner cannot be closed.  */

public class Oracle {

	private String oldAnswer = "The answer is in your heart.  ";
	private String newAnswer; 
	private String question;
	
	/** First, the main method from OracleDemo calls the chat() method in this class.  */
	public void chat() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("I am the oracle. "); 
		System.out.println("I will answer any one-line question.  "); 
		
		String response; 
		
		/** 
		 * Due while loop allows chat() to call the answer() method at least once.  After the first try, it will prompt a question asking that if 
		 * I want to ask another question.  answer() will only be called again if the answer is "yes".  
		 */
		do {
			answer();
			System.out.println("Do you wish to ask another question?  "
					+ "\nEnter \"yes\" to continue.  "); 
			response = input.next();
		} while(response.equalsIgnoreCase("yes"));
		System.out.println("The oracle will now rest.  ");
	}
		
	/** If answer is "yes", chat() method will invoke answer() method.  */
	public void answer() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your question?  ");
		question = input.nextLine();
		/** Invokes seekAdvice() method before return to answer() method to print the remaining two strings.  */
		seekAdvice();
		System.out.println("You asked the question:  \n" + question);
		System.out.println("Now, here is my answer:  " + oldAnswer);
		/** Invoke the update method, which sets the new answer as the old answer */
		update();
	}
	
	/** Invoked by the answer() method.  */
	private void seekAdvice() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hmm, I need some help on that.  "); 
		System.out.println("Please give me one line of advice.  "); 
		newAnswer = input.nextLine();
		System.out.println("Thank you.  That helped a lot.  ");
	}
	
	private void update() {
		oldAnswer = newAnswer; 
	}
	
}

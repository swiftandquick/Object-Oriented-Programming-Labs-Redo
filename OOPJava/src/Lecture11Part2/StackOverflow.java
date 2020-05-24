package Lecture11Part2;

public class StackOverflow {

	public static void main(String args[]) {
		displayAsWords(100);
	}
	
	/**
	 * Number will always be 100 and there is nothing to change it or stop the loop,
	 * thus, an infinite recursion occurs.
	 */
	public static void displayAsWords(int number) {
		displayAsWords(number / 10);
		System.out.print(getWordFromDigit(number % 10) + " ");
	}
	
	public static String getWordFromDigit(int remainder) {
		return Integer.toString(remainder);
	}
	
}

package Lecture3Part3;

public class StringDemo {

	public static void main(String args[]) {
		String sentence = "Text processing is hard!";
		System.out.println(sentence + "\n" + 
				"012345678901234567890123");
		
		/** Find the index of the substring "hard".  */
		int index = sentence.indexOf("hard");
		System.out.printf("The word \"hard\" starts at index %d\n", index);
		
		System.out.println("The changed string is \n" + sentence.toUpperCase());
	}
	
}

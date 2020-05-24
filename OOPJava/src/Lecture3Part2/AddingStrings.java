package Lecture3Part2;

public class AddingStrings {

	/** Variables of the same type can add together.  
	 */
	public static void main(String args[]) {
		
		String s1 = "Java is ";
		String s2 = "fun. "; 
		String combine = s1 + s2; 
		System.out.println(combine); 
		
		String comparedString = "java is fun. ";
		
		/** Find the size of the string.  */
		System.out.println(combine.length());

		/** Transform all characters to lower case.  */
		System.out.println(combine.toLowerCase());

		/** Transform all characters to upper case.  */
		System.out.println(combine.toUpperCase());
		
		/** Replaces old characters to new characters.  */
		System.out.println(combine.replace(" ", "_"));
		
		/** Returns a new substring that has the same character as the substring that begins at index Start of this string through to the end of the string.  
		 * Index numbers begins at 0*/
		System.out.println(combine.substring(5));
		
		/** Returns the substring between 1st index and (2nd index - 1).  */
		System.out.println(combine.substring(5, 7));
		
		/** Returns a new string having the same character as this string, but with leading and traliing whitespace removed.  */
		System.out.println(combine.trim());
		
		/** Checks if the compared string is equal to the combined string.  */
		System.out.println(comparedString.equals(combine));
		
		/** Checks if the compared string is equal to the combined string while ignoring case differences.  */
		System.out.println(comparedString.equalsIgnoreCase(combine));
		
	}
	
}

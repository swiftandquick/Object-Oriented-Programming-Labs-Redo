package Lecture8Part1;

public class SpeciesEqualsDemo {

	public static void main(String[] args) {
		
		/** Create two new objects.  */
		Species s1 = new Species(), s2 = new Species();
		
		/** Sets local variables for each of the two species.  */
		s1.setSpecies("Klingon ox", 10, 15);
		s2.setSpecies("Klingon ox", 10, 15);
		
		if (s1 == s2) {
			System.out.println("Match with ==.");
		}
		else {
			System.out.println("Do not match with ==.  ");
		}
		
		/** equals() is not a predefined method, but rather, it's a method in Species class, and I call it in the conditional statement.  */
		if (s1.equals(s2)) {
			System.out.println("Match with the method equals.  ");
		}
		else {
			System.out.println("Do not match with the method equals.  "); 
		}
		
		/** The K change to lower case k.  It should still match because s1 and s2 are compared with equalsIgnoreCase method.  */
		s2.setSpecies("klingon ox", 10, 15); 
		if (s1.equals(s2)) {
			System.out.println("Match with the method equals.  ");
		}
		else {
			System.out.println("Do not match with the method equals.  ");
		}
		
		/** Can't compare individual variables in this class since instance variables in Species classes are set private, therefore s1.name and s2.name cannot 
		 * be compared, only way to compare is calling the equals() method.  
		 */
				
	}
	
}

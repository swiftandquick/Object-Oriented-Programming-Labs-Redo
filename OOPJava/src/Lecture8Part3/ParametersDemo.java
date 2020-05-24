package Lecture8Part3;

public class ParametersDemo {

	public static void main(String[] args) {
		DemoSpecies s1 = new DemoSpecies(), 
					s2 = new DemoSpecies();
		
		s1.setSpecies("Klingon ox", 10, 15);
		
		int aPopulation = 42;
		
		// No change.  
		System.out.println("aPopulation BEFORE calling " + "tryToChange:  " + aPopulation);
		s1.tryToChange(aPopulation);
		System.out.println("aPopulation AFTER calling " + "tryToChange:  " + aPopulation); 

		// No change. 
		s2.setSpecies("Ferengie Fur Ball", 90, 56);
		System.out.println("s2 BEFORE calling tryToReplace:  ");
		s2.writeOutput(); 

		// No change.  
		s1.tryToReplace(s2);
		System.out.println("s2 AFTER calling tryToReplace:  ");
		s2.writeOutput();
		
		// Changes.  
		s1.change(s2);
		System.out.println("s2 AFTER calling change:  ");
		s2.writeOutput();
	}
	
}

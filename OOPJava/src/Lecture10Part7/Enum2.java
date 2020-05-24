package Lecture10Part7;

public class Enum2 {

	/** enum can be used inside the class.  */
	enum Flavor {
		CHOCOLATE, VANILLA, STRAWBERRY;
		
		public static void getVanilla() {
			System.out.println(Flavor.VANILLA);
		}
	}
	
	public static void main(String args[]) {
		
		Flavor flav = Flavor.VANILLA;
		
		if (flav == flav.VANILLA) {
			System.out.println("It's vanilla.  ");
		}
		else if (flav == flav.CHOCOLATE) {
			System.out.println("It's chocolate.  "); 
		}
		else if (flav == flav.STRAWBERRY) {
			System.out.println("It's strawberry.  "); 
		}
		
	}
	
}

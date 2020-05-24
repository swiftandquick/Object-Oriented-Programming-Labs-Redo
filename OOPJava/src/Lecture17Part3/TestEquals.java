package Lecture17Part3;

public class TestEquals {

	public static void main(String args[]) {
		
		/**
		 * While elements in array1 and array2 are the equal, arrays are objects, so the
		 * the two arrays' elements are allocated to different memory locations.
		 * Therefore, they cannot be compared by "==".
		 */
		int[] array1 = {1, 2, 3};
		int[] array2 = {1, 2, 3};
		
		if (array1 == array2) {
			System.out.println("Equal by ==.  ");
		}
		else {
			System.out.println("Not equal by ==.  ");
		}
		
		if (equals(array1, array2)) {
			System.out.println("Equal by the equals method.  ");
		}
		else {
			System.out.println("Not equal by the equals method.  ");
		}
		
	}
	
	public static boolean equals(int[] rArray1, int[] rArray2) {
		if (rArray1.length == rArray2.length) {
			for (int i = 0; i < rArray1.length; i++) {
				if (rArray1[i] != rArray2[i]) {
					return false;
				}
			}
			return true;
		}
		else {
			return false;
		}
	}
	
}

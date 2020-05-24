package Lecture17Part4;

public class ReturnArrayDemo {

	public static void main(String args[]) {
		
		int[] array = {1, 2, 3, 4, 5};
		int[] copiedArray = {};
		
		copiedArray = returnArray(array);
		
		printIndice(copiedArray);
		
	}
	
	public static int[] returnArray(int[] rArray) {
		return rArray;
	}
	
	public static void printIndice(int[] rCopiedArray) {
		for (int i = 0; i < rCopiedArray.length; i++) {
			System.out.println(rCopiedArray[i]);
		}
	}
	
}

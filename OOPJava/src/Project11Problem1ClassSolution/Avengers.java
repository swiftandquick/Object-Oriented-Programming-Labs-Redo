package Project11Problem1ClassSolution;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Avengers {

	private HashSet<String> hashSet = new HashSet<String>();
	
	public void removeDuplicates() throws FileNotFoundException{
		Scanner input = new Scanner(new FileInputStream("src/Project11Problem1ClassSolution/names.txt"));
		int count = 1;
		while (input.hasNextLine()) {
			String line = input.nextLine();
			/**
			 * After the third line, add the lines to a hashSet. If the lines are repeated, 
			 * they will be removed, because HashSet doesn't allow duplicates.  
			 */
			if (count >= 3) {
				hashSet.add(line);
			}
			/** Prints out the first two lines.  */
			else {
				System.out.println(line);
			}
			count++;
		}
	}
	
	public void invite() {
		Iterator<String> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	public static void main(String args[]) throws Exception {
		Avengers invitation = new Avengers(); 
		try {
			invitation.removeDuplicates();
			invitation.invite();
		}
		catch (FileNotFoundException e) {
			System.out.println("File not located.  ");
		}
		
	}
	
}

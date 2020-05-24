package IOPart1;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CreateAndWriteOnFile {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		/**
		 * Create a String for the file name, when the program finish running, there
		 * should be a file called file.txt in the same folder as CreateFile.java. To
		 * find the path of CreateFile.java, I can simply click on it, then choose
		 * Properties, and there will be an address of it.
		 */
		String file = "src/IOPart1/file.txt";
		
		/**
		 * Creates an empty file. Be careful with the PrintWriter object, as it rewrites
		 * the entire file instead of just updating it.
		 */
		PrintWriter outputstream = null;
		
		try {
			outputstream = new PrintWriter(file);
		}
		catch(FileNotFoundException e) {
			System.out.println("Error opening the file " + file);
			System.exit(0);
		}
		
		System.out.println("Enter three lines of text:  ");
		for (int count = 1; count <= 3; count++) {
			String line = input.nextLine();
			outputstream.println(count + " " + line);
		}
		
		System.out.println("Those lines were written to " + file);
		
		outputstream.close();
		input.close();
		
	}
	
}

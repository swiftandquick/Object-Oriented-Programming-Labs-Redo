package IOPart2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String args[]) {

		try {
			/** The following is the absolute path, it also works.  
			Scanner readFile = new Scanner(new File("C:\\Users\\" + "Yong Chen\\Desktop\\Eclipse Work Space\\"
					+ "Java Object Oriented Programming\\OOPJava\\" + "src\\IOPart2\\file.txt"));
			*/
			
			/** Previously, reading file through relative path doesn't work, I am not sure why.  */
			Scanner readFile = new Scanner(new File("src/IOPart2/file.txt"));
			System.out.println("The file file.txt ");
			System.out.println("contains the following lines:  ");
			while(readFile.hasNextLine()) {
				System.out.println(readFile.nextLine());
			}
		} 
		catch (FileNotFoundException e) {
			System.out.println("Cannot open such a file.  ");
		}

	}

}

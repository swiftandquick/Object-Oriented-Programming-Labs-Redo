package Project11Problem1;

import java.io.*;
import java.util.Scanner;

/**
 * I am not sure how to get relative path of a text file, but to get absolute 
 * path of the file, I can just right click on the file, then click on Properties.  
 */

public class Avengers {
	
	private Scanner file;

	public void getPath() {
		System.out.println(new java.io.File("names.txt").getAbsolutePath());
	}
	
	public void openFile() {
		try {
			file = new Scanner(new File("C:\\Users\\Yong Chen"
					+ "\\Desktop\\Eclipse Work Space\\Java Object Oriented Programming\\"
					+ "OOPJava\\src\\Project11Problem1\\names.txt"));
		} 
		catch (Exception e) {
			System.out.println("Could not find file.  ");
		}
	}

	/** Reads the file and prints the next line. */
	public void readFile() {
		while (file.hasNext()) {
			System.out.println(file.nextLine());
		}
	}

	public void closeFile() {
		file.close();
	}

}

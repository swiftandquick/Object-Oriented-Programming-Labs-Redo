package Project11Problem1Alternative;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Avengers {

	public void getPath() {
		File file = new File("names.txt");
		System.out.println(file.getAbsoluteFile());
	}
	
	public void checkFile() {
		/** Absolute path:  
		 * File file = new File("C:\\Users\\Yong Chen\\Desktop\\Eclipse Work Space\\Java Object Oriented Programming\\OOPJava\\names.txt");
		 */
		File file = new File("src/Project11Problem1Alternative/names.txt");
		System.out.println(file.exists() ? "Exists!" : "Doesn't exist!");
		System.out.println(file.canRead() ? "Can read!" : "Can't read!");
		System.out.println(file.canWrite() ? "Can write!" : "Can't write!");
		System.out.println("Name:  " + file.getName());
		System.out.println("Path:  " + file.getPath());
		System.out.println("Size:  " + file.length() + " bytes");
	}
	
	public void readFile() {
		System.out.println(" < File Content >");
		File file = new File("src/Project11Problem1Alternative/names.txt");
		Scanner read = null;
		try {
			read = new Scanner(file);
			while (read.hasNextLine()) {
				String line = read.nextLine();
				System.out.println(line);
			}
			read.close();
		} 
		catch (FileNotFoundException e) {
			System.out.println("File not found!  ");
		}
	}
	
}

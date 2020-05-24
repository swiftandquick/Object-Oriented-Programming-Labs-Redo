package IOPart3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		Scanner readFile = null;
		
		/** 
		 * For some reason only absolute path works.  So I must enter:  
		 * C:\Users\Yong Chen\Desktop\Eclipse Work Space\Java Object Oriented Programming\OOPJava\src\IOPart3\file.txt
		 * This is no longer true, I can enter relative path at:  src/IOPart3/file.txt  
		 */
		try {
			System.out.println("Enter file name:  ");
			String fileName = input.nextLine();
			readFile = new Scanner(new File(fileName)); 
			System.out.println("The file file.txt ");
			System.out.println("Contains the following lines:  ");
			while(readFile.hasNextLine()) {
				System.out.println(readFile.nextLine());
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("No such file exist.  ");
		}
		
		input.close();
		
	}
	
}

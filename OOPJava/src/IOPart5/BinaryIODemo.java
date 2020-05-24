package IOPart5;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
// import java.io.PrintWriter;
import java.util.Scanner;

public class BinaryIODemo {

	/**
	 * The output on the numbers.txt file is weird, I was supposed to write the
	 * output on numbers.dat file (binary file) instead of a text file. 
	 */
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		/** I can use relative path since I am writing outputs (now, it's true for inputs as well).  */
		String file = "src/IOPart5/numbers.dat";
		
		/**
		 * I can compare ObjectOutputStream and PrintWriter codes for output side by
		 * side. I comment out the PrintWriter codes. PrintWriter is for normal files,
		 * ObjectOutputStream is for binary files.
		 */
		try {
			ObjectOutputStream write = new ObjectOutputStream(new FileOutputStream(file));
			// PrintWriter write = new PrintWriter(file);
			System.out.println("Enter non-negative integers.  ");
			System.out.println("Place a negative number at the end.  ");
			int integer;
			do {
				integer = input.nextInt();
				write.writeInt(integer);
				// write.print(integer);
			} while (integer >= 0);
			System.out.println("Number and sentinel value ");
			System.out.println("written to the file " + file);
			write.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("Problem opening the file " + file + ".  ");
		}
		catch (IOException e) {
			System.out.println("Please enter integers only.  ");
		}
		
		input.close();
		
		try {
			ObjectInputStream read = new ObjectInputStream(new FileInputStream(file));
			System.out.println("Reading the non-negative integers ");
			System.out.println("in the file numbers.dat.  ");
			int integer = read.readInt();
			while(integer >= 0) {
				System.out.println(integer);
				integer = read.readInt();
			}
			System.out.println("End of reading from file.  ");
			read.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("File cannot be located.  ");
		}
		catch (EOFException e) {
			System.out.println("Problem with reading the file.  ");
			System.out.println("Reached end of the file.  ");
		}
		catch (IOException e) {
			System.out.println("It's not an integer.  ");
		}
		
	}
	
}

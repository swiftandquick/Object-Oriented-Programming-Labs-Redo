package IOPart6;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/** This class supposedly prints out 1, 2, 3, -1.  */
public class EOFExceptionDemo {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		/** Use absolute path for both input and output stream.  
		String file = "C:\\Users\\Yong Chen\\Desktop\\Eclipse Work Space\\"
				+ "Java Object Oriented Programming\\OOPJava\\src\\IOPart6\\numbers.dat";
		*/
		String file = "src/IOPart6/numbers.dat";
		
		/** Using input stream to insert non-negative integers.  */
		try {
			ObjectOutputStream write = new ObjectOutputStream(new FileOutputStream(file));
			System.out.println("Enter non-negative integers.  ");
			System.out.println("Place a negative number at the end.  ");
			int integer;
			do {
				integer = input.nextInt();
				write.writeInt(integer);
			} while (integer >= 0);
			System.out.println("Numbers and sentinel value ");
			System.out.println("written to the file numbers.dat.  ");
			/** I have to close the ObjectOutputStream called write for the program to work.  */
			write.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("No such file exists!  ");
		}
		catch (IOException e) {
			System.out.println("Invalid input.  ");
		}
		
		input.close();	
		
		/** Using output stream to read all all integers, including the negative ones.  */
		try {
			ObjectInputStream read = new ObjectInputStream(new FileInputStream(file));
			System.out.println("Reading ALL the integers ");
			System.out.println("in the file numbers.dat.  ");
			try {
				/** No condition this time, as it reads all integers.  Loop ends when exception is thrown.  */
				while(true) {
					int integer = read.readInt();
					System.out.println(integer);
				}
			}
			/**
			 * Many of the methods that read from a binary file will throw an EOFException
			 * when they try to read beyond the end of a file.
			 */
			catch (EOFException e) {
				System.out.println("End of reading from file.  ");
			}
			read.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("No such file exists!  ");
		}
		catch (IOException e) {
			System.out.println("Invalid input.  ");
		}
		
	}
	
}

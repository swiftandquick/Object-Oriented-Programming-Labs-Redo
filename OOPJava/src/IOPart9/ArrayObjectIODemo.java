package IOPart9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ArrayObjectIODemo {

	@SuppressWarnings("null")
	public static void main(String args[]) {
		
		/** Absolute path:  
		String file = "C:\\Users\\Yong Chen\\Desktop\\Eclipse Work Space\\"
				+ "Java Object Oriented Programming\\OOPJava\\src\\IOPart9\\array.dat";
		*/
		/** Relative path:  */
		String file = "src/IOPart9/array.dat";
		
		ObjectOutputStream write = null;
		
		try {
			write = new ObjectOutputStream(new FileOutputStream(file));
		}
		catch (FileNotFoundException e) {
			System.out.println("No such file existed.  ");
			System.exit(0); // Terminates the program.  
		}
		catch (IOException e) {
			System.out.println("I/O error!  ");
			System.exit(0); // Terminates the program.  
		}
		
		/** Initializes the length of species array as 2.  */
		Species[] species = new Species[2];
		
		species[0] = new Species("Calif. Condor", 27, 0.02);
		species[1] = new Species("Black Rhino", 100, 1.0);
		
		/**
		 * Key difference, I write the entire array of objects instead of writing down
		 * individual objects (as array elements) via array.
		 */
		try {
			write.writeObject(species);
			write.close();
		}
		catch (IOException e) {
			System.out.println("I/O error!  ");
			System.exit(0);
		}
		
		System.out.println("Array written to file array.dat and file is closed.  ");
		System.out.println("Open the file for input and echo the array.  ");
		System.out.println("The following were read from the file array.dat:  ");
		
		ObjectInputStream read = null;
		
		try {
			read = new ObjectInputStream(new FileInputStream(file));
		}
		catch (FileNotFoundException e) {
			System.out.println("No such file existed.  ");
			System.exit(0); // Terminates the program.  
		}
		catch (IOException e) {
			System.out.println("I/O error!  ");
			System.exit(0); // Terminates the program.  
		}
		
		/** Set up an empty array, which will copy the array from the file.  */
		Species[] readSpecies = new Species[species.length];
		
		try {
			/**
			 * Now the line below works because the next object is an array of objects, just
			 * like readSpecies. So, I can equalize readSpecies as the next object.
			 */
			readSpecies = (Species[]) read.readObject();
			for (int i = 0; i < readSpecies.length; i++) {
				/** Now, I can print out each element (object) on the array of objects.  */
				System.out.println(readSpecies[i]);
			}
			System.out.println("End of program.  ");  
			read.close();
		}
		catch (IOException e) {
			System.out.println("I/O error!  ");
		}
		catch (ClassNotFoundException e) {
			System.out.println("Class not found!  ");
		}
		
	}
	
}

package IOPart7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ClassObjectIODemo {

	public static void main(String args[]) {
		
		/** Absolute path:  
		String file = "C:\\Users\\Yong Chen\\Desktop\\Eclipse Work Space\\"
				+ "Java Object Oriented Programming\\OOPJava\\src\\IOPart7\\species.records";
		*/
		
		/** Relative path:  */
		String file = "src/IOPart7/species.records";
		
		ObjectOutputStream write = null;
		
		try {
			write = new ObjectOutputStream(new FileOutputStream(file));
		}
		catch (FileNotFoundException e) {
			System.out.println("File not located.  ");
			System.exit(0); // Terminates the program.  
		}
		catch (IOException e) {
			System.out.println("Error in opening the file.  ");
			System.exit(0); // Terminates the program.  
		}
		
		Species califCondor = new Species("Calif. Condor", 27, 0.02);
		Species blackRhino = new Species("Black Rhino", 100, 1.0);
		
		/** Write objects to the file.  */
		try {
			write.writeObject(califCondor);
			write.writeObject(blackRhino);
			write.close(); // close the output stream in order to run input stream later.  
		}
		catch (IOException e) {
			System.out.println("Errors in writing to file.  ");
			System.exit(0); // Terminates the program.  
		}
		
		System.out.println("Records sent to file species.records.  ");
		System.out.println("Now let's reopen the file and echo the records.  ");
		
		ObjectInputStream read = null;
		
		try {
			read = new ObjectInputStream (new FileInputStream(file));
		}
		catch (FileNotFoundException e) {
			System.out.println("File not located.  ");
			System.exit(0); // Terminates the program.  
		}
		catch (IOException e) {
			System.out.println("Error in opening the file.  ");
			System.exit(0); // Terminates the program.  
		}
				
		try {
			/**
			 * readObject only retrieves the object, as the object retrieved from readObject
			 * does not have a name, so I have to cast those objects as Species.
			 */
			Species species1 = (Species) read.readObject();
			Species species2 = (Species) read.readObject();
			System.out.println(species1);
			System.out.println(species2);
			read.close();
		}
		catch (IOException e) {
			System.out.println("Error in opening the file.  ");
		}
		catch (ClassNotFoundException e) {
			System.out.println("Class not found!  ");
		}
		
		System.out.println("End of program.  ");
		
	}
	
}

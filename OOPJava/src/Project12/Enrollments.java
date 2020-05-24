package Project12;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Enrollments {

	private HashMap <Integer, ArrayList<String>> students = new HashMap <Integer, ArrayList<String>>();
	
	private String file = "src/Project12/enrollments.dat";
	
	public void sortClasses() throws FileNotFoundException, IOException {
		
		/** 
		 * Gets the output stream for binary files.  
		 * Warning:  Use DataInputStream rather than ObjectInputStream!  
		 */
		DataInputStream read = new DataInputStream(new FileInputStream(file));
		
		System.out.println("Contents of \"enrollments.dat\"\n");
		
		/**
		 * The do while loop keeps on going until the the available() method no longer
		 * reads anything, at that point, its value should be -1, so less than 0.
		 */
		do {
			
			/**
			 * The pattern of the binary file is integer (represented by weird characters),
			 * then String of characters, then back to integers, then back to String of
			 * characters. Thus, there is no need to split String into two since integer 
			 * and String are already separated.
			 */
			
			/** Use readInt() to retrieved the integer.  Next part is the String.  */
			int studentId = read.readInt();
			
			/** Use readUTF() to retrieved the String.  Next part is back to the integer.  */
			String course = read.readUTF();
			
			System.out.printf("#%05d, %s\n", studentId, course);
			
			/**
			 * Check if the map students has the key equal to current studentId. If it does,
			 * add the course to the corresponding ArrayList (list of courses).
			 */
			if (students.containsKey(studentId)) {
				/**
				 * Only add the course if the corresponding ArrayList of courses has not contain
				 * the course yet.
				 */
				if (!students.get(studentId).contains(course)) {
					students.get(studentId).add(course);										
				}
			}			
			/**
			 * Otherwise, I create a new class list as ArrayList, then add the new course to
			 * it. Then, I add the new ID and new class list to the map.
			 */
			else {
				ArrayList <String> newClassList = new ArrayList<String>();
				newClassList.add(course);
				students.put(studentId, newClassList);
			}
			
		} while (read.available() > 0);
		
		/** Close the object input stream when we no longer need it.  */
		read.close();
		
	}
	
	public void classList() {
		
		System.out.println("\n\nResulting student enrollments:  \n");
		
		/** Iterate through every student ID, as the student ID serves as the key to the students HashMap.  */
		for (Integer student : students.keySet()) {

			/** Prints the student ID in 5 digits format.  */
			System.out.printf("Student ID:  #%05d\n", student);

			/**
			 * Checks if the number of courses for each student by getting their
			 * corresponding ArrayList (value) via students.get(student). Then, I find the
			 * size of the ArrayList by adding .size() method at the end.
			 */
			int numberOfCourses = students.get(student).size();
			
			/** If the ArrayList contains more than 1 course, then I made course a plural word.  */
			System.out.printf("%d course%s\n", numberOfCourses, (numberOfCourses > 1 ? "s" : ""));

			for (int i = 0; i < students.get(student).size(); i++) {
				System.out.println("\t" + students.get(student).get(i));
			}
			
			System.out.println();
		}
		
	}
	
	public static void main(String args[]) {
		
		/** Creates an object purely for testing methods.  */
		Enrollments enroll = new Enrollments();
		
		try {
			// enroll.createClasses();
			enroll.sortClasses();
			enroll.classList();
		}
		catch (FileNotFoundException e) {
			System.out.println("File not located.  ");
		}
		catch (IOException e) {
			System.out.println("I/O error.  ");
		}
		
	}
	
}

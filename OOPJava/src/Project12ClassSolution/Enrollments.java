package Project12ClassSolution;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Enrollments {

	public static void main(String args[]) {
		try {
			showBinaryEnrollments();
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found.  ");
		}
		catch (IOException e) {
			System.out.println("I/O error.  ");
		}
	}
	
	private static void showBinaryEnrollments() throws FileNotFoundException, IOException {
		
		/** Set up the HashMap.  */
		HashMap <Integer, ArrayList<String>> enrollments = new HashMap <Integer, ArrayList<String>> ();
		
		/** 
		 * Use DataInputStream and FileInputStream to gain access to reading the file.  
		 * Warning:  Use DataInputStream rather than ObjectInputStream.  
		 */
		DataInputStream read = new DataInputStream(new FileInputStream("src/Project12ClassSolution/enrollments.dat"));
		
		/** Initialize studentId, courseId, and courses ArrayList for later uses.  */
		int studentId;
		String courseId;
		ArrayList<String> courses;
		
		/**
		 * If read.avalaible() reads any character, it will return a value of at least
		 * 0. If it returns -1, that's because the file has come to the end and there is
		 * nothing the ObjectInputStream can read. The available() method checks whether
		 * we are at end of file (EOF) or not.
		 */
		do {

			/** A method to get an integer from the stream.  */
			studentId = read.readInt();
			
			/** A method to get a string from the stream in UTF-8 format, I am not sure if this is the right one.  */
			courseId = read.readUTF();

			/** Prints the studentId and courseId, studentId is printed in 5 digit format.  */
			System.out.printf("%5d, %s\n", studentId, courseId);
			
			/**
			 * If the student with studentId is already in the 'database', get their
			 * enrolled courses. Otherwise this is the first course for the student by
			 * creating a new String ArrayList to store courses.  getOrDefault() means 
			 * that if I can't get the studentId (key) from enrollments (HashMap), 
			 * it will return the right side value, which is a new ArrayList.  
			 */
			courses = enrollments.getOrDefault(studentId, new ArrayList<String>());

			/** Adds the course to courses ArrayList.  */
			courses.add(courseId);
			
			/**
			 * Put studentId and courses on the enrollments HashMap. If courses change, then
			 * the new courses value will replace the old one.
			 */
			enrollments.put(studentId, courses);
			
		} while (read.available() > 0); 
		
		/** Close the object input stream.  */
		read.close();
		
		System.out.println("\n\nResulting student enrollments:  ");
		
		/** Loops through every key (student) in the enrollments HashMap.  */
		for (Integer student : enrollments.keySet()) {
			/** Prints out the student ID in 5 digit format.  */
			System.out.printf("\nStudent:  %05d\n", student);
			/** Get the size of the value (ArrayList) corresponding to the student ID (key).  */
			int enrollmentCount = enrollments.get(student).size();
			/** Prints out the size, if the size is 1, then no plural for the word course.  */
			System.out.printf("%d Course%s:\n", enrollmentCount, (enrollmentCount == 1 ? "" : "s"));
			/** Loops through every course in the ArrayList and print them out.  */
			for (String course : enrollments.get(student)) {
				System.out.printf("%5s%s\n", "", course);
			}
		}
		
	}
	
}

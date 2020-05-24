package Project11Problem2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Students {

	/** Private instance variable that has Integer (ID) as key and ArrayList<String> (classes) as value.  */
	private HashMap<Integer, ArrayList<String>> students = new HashMap<Integer, ArrayList<String>>();
	
	public void sortClasses() throws FileNotFoundException, NumberFormatException, ArrayIndexOutOfBoundsException {
		
		/** Tries to read the file.  */
		Scanner read = new Scanner(new FileInputStream("src/Project11Problem2/students.txt"));
		
		System.out.println("The file contains:  \n--------------------");
		
		while (read.hasNextLine() ) {
		
			/** Split each line by space into two separate Strings, store them in split String array.  */
			String[] split = read.nextLine().split(" ");
			
			/** Transforms the student ID from string to integer.  */
			int studentId = Integer.parseInt(split[0]);
			System.out.print(studentId);
			
			/**
			 * Breaks the loop if the studentId is negative. Although the instruction says I
			 * should break the loop if ID is -1 only.
			 */
			if (studentId < 0) {
				break;
			}
			
			/** Second part of the String become course, I can't use class as String name because it's a keyword.  */
			String course = split[1];
			System.out.print(" " + course + "\n");

			/**
			 * If the students HashMap has the key studentId (Integer), then just add the
			 * course on the already existing ArrayList that is associated with the
			 * HashMap's existing key.
			 */
			if (students.containsKey(studentId)) {
				/**
				 * Only add the course to the ArrayList if the ArrayList doesn't contain the
				 * class, I don't want duplicated classes add to the same students.  Although, 
				 * two different students can have the same course, that's not the problem.  
				 */
				if (!students.get(studentId).contains(course)) {
					/**
					 * students.get(studentId) gets the value corresponding to the key (studentId),
					 * add(course) adds the element on the existing ArrayList (value).
					 */
					students.get(studentId).add(course);
				}
			}
			/**
			 * If the HashMap doesn't contain the studentId (key), then I can create a new
			 * empty ArrayList, add the course to it. Then I put both the new studentId and
			 * new ArrayList (newClassList) to the map.
			 */
			else {
				ArrayList<String> newClassesList = new ArrayList<String>();
				newClassesList.add(course);
				students.put(studentId, newClassesList);
			}
			
		}

		System.out.println("\n--------------------\n");
		
		read.close();
	}
	
	public void classList() {
		System.out.println("All data:  ");
		System.out.println("--------------------");
		for (Integer student : students.keySet()) {
			System.out.println("Student ID:  " + student);
			for (String course : students.get(student)) {
				System.out.println(" " + course);
			}
		}
		System.out.println("--------------------");
	}
	
	public static void main(String args[]) {
		
		/** Creates a Students object named studentsObj purely for invoke methods.  */
		Students studentsObj = new Students();
		
		try {
			studentsObj.sortClasses();
			studentsObj.classList();
		}
		catch (FileNotFoundException e) {
			System.out.println("\nFile doesn't exist.  ");
		}
		catch (NumberFormatException e) {
			System.out.println("\nStudent ID is not a number.  ");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("\n\nThere is no class assigned to the student.  ");
		}
		
	}
	
}

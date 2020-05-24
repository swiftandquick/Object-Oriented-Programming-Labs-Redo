package Project11Problem2ClassSolution;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Students {

	public static void main(String args[]) {
		
		BufferedReader br = null;
		String line = "";
		
		/** Use BufferedReader to read the file.  */
		try {
			br = new BufferedReader(new FileReader("src/Project11Problem2ClassSolution/students.txt"));
			line = br.readLine();
		}
		catch (FileNotFoundException e) {
			System.out.println("File cannot be located.  ");
		} 
		catch (IOException e) {
			System.out.println("I/O error.  ");
		}
		
		/**
		 * Prints out the student ID and the courses. Split the line into two parts.
		 * Before the space, the substring become an integer called id. After the space,
		 * the substring became the course.
		 */
		int id = Integer.parseInt(line.substring(0, line.indexOf(" ")));
		String course = (line.substring(line.indexOf(" ") + 1));
		System.out.println(id + " " + course);
		
		HashMap<Integer, ArrayList<String>> students = new HashMap<Integer, ArrayList<String>>();
		
		/** The loop continues while id is not -1.  */
		while(id != -1) {
			
			/**
			 * If the students HashMap contains id (the key), then add the course to the
			 * classes (the value, ArrayList).  
			 */
			if (students.containsKey(id)) {
				students.get(id).add(course);
			}
			/** 
			 * If the students HashMap doesn't contain the id, then we can add the current 
			 * id into the HashMap.  I will also need to create an empty ArrayList, add the 
			 * current course into the ArrayList, then add the ArrayList to the HashMap.  
			 */
			else {
				ArrayList<String> list = new ArrayList<String>();
				list.add(course);
				students.put(id, list);
			}
			
			/** Read the next line and set it to line, throw an I/O exception just in case.  */
			try {
				line = br.readLine();
			}
			catch (IOException e) {
				System.out.println("I/O error.  ");
			}
			
			/** Reset id and id and course value based on the next line that is read.  */
			if (line.indexOf(" ") != -1) {
				id = Integer.parseInt(line.substring(0, line.indexOf(" ")));
				course = (line.substring(line.indexOf(" ") + 1));
				System.out.println(id + " " + course);
			}
			/** If substring before space is not equivalent to -1, then set id to -1.  */
			else {
				id = -1;
				System.out.println(id);
			}
			
		}
		
		/** Creates a set based on the entry sets of the HashMap.  */
		Set lset = students.entrySet();
		
		/** Creates an iterator based on the set.  */
		Iterator<Set> lIterator = lset.iterator();
	
		System.out.println("\n\n\n\nIndividual Student Schedules:  ");
		System.out.println("__________________________________________________\n");
		
		/** Loop runs while the iterator has the next set.  */
		while(lIterator.hasNext()) {

			/** Use map entry to equate value and key of the set to the current iterator set.  */
			@SuppressWarnings({ "unchecked", "rawtypes" })
			Map.Entry<Integer, ArrayList<String>> KeyValuePair = (Map.Entry)lIterator.next();
			
			/** Get the key of the HashMap.  */
			int key = KeyValuePair.getKey();
			System.out.println("Student ID:  ");

			/** 
			 * Prints the id in 5 digits format, if id is 1, it will print 00001.  It's optional, 
			 * but it's do-able by transforming the key to String, then check what the length of 
			 * the String is.  If the length < 5, then I should keep adding 0 in front of it 
			 * until the length is 5.  
			 */
			if (String.valueOf(key).length() < 5) {
				for(int i = 1; i <= 5 - String.valueOf(key).length(); i++) {
					System.out.print("0");
				}
			}
			System.out.println(key);
			System.out.println("Classes");
			
			/**
			 * Creates a new array list called output, then equal it to the array list that
			 * is associated with the key (student id).
			 */
			ArrayList<String> output = students.get(key);
			System.out.println("__________");

			/** Use for loop to print out the individual String elements from the ArrayList.  */
			for (int i = 0; i < output.size(); i++) {
				System.out.println(output.get(i));
			}
			
			System.out.println("__________");
		}
		
	}
	
}

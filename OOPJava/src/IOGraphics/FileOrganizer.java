package IOGraphics;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import ExceptionGraphics.WindowDestroyer;

/**
 * I should make a file called file.txt, then add contents in that file
 * manually.  After that, I run this file to test the show first line and 
 * remove buttons to see if they are working.  The file name of file.txt 
 * in the same package should be src/IOGraphics/file.txt.  
 */

@SuppressWarnings("serial")
public class FileOrganizer extends JFrame implements ActionListener {

	/**
	 * Static variables don't have to be declared in all caps, but it's good to do
	 * that to separate static variables from other variables.
	 */
	public static final int WIDTH = 400;
	public static final int HEIGHT = 300;
	public static final int NUMBER_OF_CHAR = 30;

	/**
	 * JTextField is set as private instance variables because more than 1 class in
	 * the same file need them, and their value change based on which method is invoked.  
	 */
	private JTextField fileNameField;
	private JTextField firstLineField;
	
	/** A constructor that creates a GUI.  */
	FileOrganizer() {

		/** Set the size of the GUI.  setSize() is a JFrame method.  */
		setSize(WIDTH, HEIGHT);
		
		/** WindowDestroyer can be imported, I didn't do that last time in ExceptionGraphics package.  */
		WindowDestroyer listener = new WindowDestroyer();
		addWindowListener(listener);
		
		/** Creates a container and set the layout to default FlowLayout.  */
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		/**
		 * Use JButton class to create a button object, then make it responsive to mouse
		 * clicks by adding action listener. Lastly, add the button on the Container
		 * object called contentPane. Do it for all three JButton objects (buttons).  
		 * The String I enter inside the parenthesis will be show up inside the button.  
		 */
		JButton showButton = new JButton("Show first line");
		showButton.addActionListener(this);
		contentPane.add(showButton);
		
		JButton removeButton = new JButton("Remove file");
		removeButton.addActionListener(this);
		contentPane.add(removeButton);
		
		JButton resetButton = new JButton("Reset");
		resetButton.addActionListener(this);
		contentPane.add(resetButton);
		
		/**
		 * Creates a JTextField that is 30 characters long. This does not mean that the
		 * input and output are cannot be more than 30 though.
		 */
		fileNameField = new JTextField(NUMBER_OF_CHAR);
		contentPane.add(fileNameField);
		/** Initially, the fileNameField text field contains the String in the parenthesis.  */
		fileNameField.setText("Enter file name here.  ");

		/** Creates an empty JTextField that is 30 characters long, it will display output.  */
		firstLineField = new JTextField(NUMBER_OF_CHAR);
		contentPane.add(firstLineField);
		
	}
	
	@Override
	/** By implementing ActionListener class, I have to use actionPerformed class.  */
	public void actionPerformed(ActionEvent e) {
		/**
		 * getActionCommand returns a string that is associated to an object that was
		 * being performed action on. For example, if a JButton (button) with the String
		 * value of "Show first line" is clicked, getActionCommand will return the same
		 * text, which is also "Show first line".
		 */
		String actionCommand = e.getActionCommand();
		/**
		 * Now the program will be directed to one of the three private methods based on
		 * what getActionCommand returns, which is based on what JButton I clicked.
		 */
		if (actionCommand.equals("Show first line")) {
			showFirstLine();
		}
		else if (actionCommand.equals("Remove file")) {
			removeFile();
		}
		else if (actionCommand.equals("Reset")) {
			resetFields();
		}
		/**
		 * This part will not happen because there are only 3 JButton and all their
		 * commands are included in the if or else if block.
		 */
		else {
			firstLineField.setText("Unexpected error.  ");
		}
	}
	
	/** Method invoked from clicking the "Show first line" button.  */
	private void showFirstLine() {
		
		/**
		 * Initialize Scanner outside of try-catch block, so I can use it again outside
		 * of the try-catch block later.
		 */
		Scanner read = null;
		
		/** Get the file name from JTextField using getText() method.  */
		String fileName = fileNameField.getText();
		
		/** Create a file object using the file name.  */
		File fileObject = new File(fileName);
		
		/** Set the following text in firstLineField JTextField in case if I can't find the file.  */
		if (!fileObject.exists()) {
			firstLineField.setText("No such file.  ");
		}
		/** Set the following text in firstLineField JTextField in case if I can't read the file.  */
		else if (!fileObject.canRead()) {
			firstLineField.setText("That file is not readable.  ");
		}
		/** If I can find and read the file, do the following.  */
		else {
			try {
				/** Read the file from output stream.  */
				read = new Scanner(fileObject);
			}
			/**
			 * This catch block isn't very useful, consider I already check whether I can
			 * find or read the file in the if and else-if blocks.  However, I always have 
			 * to declare a try-catch block every time I read or write a file.  
			 */
			catch(FileNotFoundException e) {
				firstLineField.setText("Error in opening the file.  ");
			}
			/** If all the tests pass, then set firstLineField JTextField as first line of the file.  */
			String firstLine = read.nextLine();
			firstLineField.setText(firstLine);
			read.close();
		}
	}
	
	/** Invoke by the "Reset" button.  */
	private void resetFields() {
		/** Reset the JTextField fields to original contents.  */
		fileNameField.setText("Enter file name here.  ");
		firstLineField.setText("");
	}
	
	/** Invoke by "Remove file" button.  */
	private void removeFile() {
		
		/** Same as before, create a file object based on fileNameField's content.  */
		String fileName = fileNameField.getText();
		File fileObject = new File(fileName);
		
		/** Checks if the file can be found.  */
		if (!fileObject.exists()) {
			firstLineField.setText("No such file.  ");
		}
		/** Checks if I can write on the file.  */
		else if (!fileObject.canWrite()) {
			firstLineField.setText("Permission denied.  ");
		}
		/** Checks if I can delete the file.  In this circumstance, I should be able to.  */
		else {
			if (fileObject.delete()) {
				firstLineField.setText("File deleted.  ");
			}
			else {
				firstLineField.setText("Could not delete file.  ");
			}
		}

	}
	
	public static void main(String[] args) {
		
		/**
		 * Creates a GUI with the object type FileOrganizer. Since I pass in no
		 * arguments, it invokes the empty constructor FileOrganizer(), and program
		 * executes that constructor after reading main method.
		 */
		FileOrganizer gui = new FileOrganizer();

		/** Set the FileOrganizer visible.  */
		gui.setVisible(true);
		
	}

}

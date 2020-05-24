package ExceptionGraphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
// import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/** This is a JFrame GUI using exceptions.  */
@SuppressWarnings("serial")
public class ColorDemo extends JFrame implements ActionListener {

	public static final int WIDTH = 400;
	public static final int HEIGHT = 300;
	public static final int NUMBER_OF_CHAR = 20;
	
	private JTextField colorName;
	
	/** Default constructor.  */
	ColorDemo() {
		/** JFrame method, sets size of the pop up frame.  */
		setSize(WIDTH, HEIGHT);
		
		/** I think this is for closing the app's windows, I am not sure.  */
		WindowDestroyer listener = new WindowDestroyer();
		addWindowListener(listener);
		
		/** The Container object can set the content of the pop up.  */
		Container contentPane = getContentPane();

		/** Set the background color to gray.  */
		contentPane.setBackground(Color.GRAY);

		/** Sets up a simple layout, in which I am allowed to add objects to it.  */
		contentPane.setLayout(new FlowLayout());
		
		/** Creates a button by using the object JButton.  */
		JButton showButton = new JButton("Show Color");

		/** Now the button can respond to actions such as clicks.  */
		showButton.addActionListener(this);
		
		/** Officially adds the button to the container.  */
		contentPane.add(showButton);
		
		/** Creates a text field by using the object JTextField.  */
		colorName = new JTextField(NUMBER_OF_CHAR);
		
		/** Officially adds the text field to the container.  */
		contentPane.add(colorName);
	}
	
	/**
	 * Use action to change the background color of the container. colorName is text
	 * field, contentPane is the container. So the container's color will change
	 * based on the text field's input.  By implementing the ActionListener interface, 
	 * I was forced the use the actionPerformed class.  
	 */
	public void actionPerformed(ActionEvent e) {
		Container contentPane = getContentPane();
		try {
			contentPane.setBackground(getColor(colorName.getText()));
		}
		catch (UnknownColorException exception) {
			colorName.setText("Unknown Color");
			contentPane.setBackground(Color.GRAY);
		}
	}
	
	/**
	 * Color is a object imported from Class. I insert the text and get the color
	 * back based on text field's input. However, only 4 colors are valid here.
	 */
	public Color getColor(String name) throws UnknownColorException {
		if (name.equalsIgnoreCase("RED")) {
			return Color.red;
		}
		else if (name.equalsIgnoreCase("WHITE")) {
			return Color.white;
		}
		else if (name.equalsIgnoreCase("BLUE")) {
			return Color.blue;
		}
		else if (name.equalsIgnoreCase("GREEN")) {
			return Color.green;
		}
		else {
			throw new UnknownColorException();
		}
	}
	
}
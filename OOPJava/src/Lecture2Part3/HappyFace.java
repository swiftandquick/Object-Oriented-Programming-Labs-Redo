package Lecture2Part3;

import javax.swing.*;
import java.awt.*;

/* Class cannot be printed out.  
 * Supposedly I right click, 
 * then "Run As", then "1 Java Applet".  
 * Applet Viewer is gone in JDK 11.  
 */

public class HappyFace extends JApplet {

	public void init() {
		// Do nothing.  
	}
	
	public void stop() {
		// Do nothing.  
	}
	
	public void paint(Graphics canvas) {
		
		/* ovalName.drawOval(x, y, width, height);  
		 * Draws an oval with no filling.  
		 */
		canvas.drawOval(100, 50, 200, 200);

		/* ovalName.fillOval(x, y, width, height);  
		 * Fills the circle with black color by default.  
		 */
		canvas.fillOval(155,  100,  10,  20);
		canvas.fillOval(230,  100,  10,  20);
		
		/* arcName.fillArc(x, y, width, height, 
		 * left-side degrees, right-side degrees);
		 * Draws an arc.  
		 */
		canvas.drawArc(150,  160,  100,  50, 180, 180);
	}
	
}

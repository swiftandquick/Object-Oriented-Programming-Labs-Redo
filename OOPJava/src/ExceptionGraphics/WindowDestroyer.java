package ExceptionGraphics;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * This file is not needed because I can import it. However, I made a mistake
 * creating a file back then, but the program still runs.
 */
public class WindowDestroyer extends WindowAdapter {
	
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
}

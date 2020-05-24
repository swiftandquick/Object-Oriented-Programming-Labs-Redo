package Lecture16Part8;

/** This is an abstract class that implements an interface.  */
public abstract class ShapeBase implements ShapeInterface {

	private int offset;
	
	public abstract void drawHere();
	
	/** Skips a number of lines, then start drawing when lines skipped = lineNumber.  */
	public void drawAt(int lineNumber) {
		for (int count = 0; count < lineNumber; count++) {
			System.out.println();
		}
		drawHere(); 
	}
	
}

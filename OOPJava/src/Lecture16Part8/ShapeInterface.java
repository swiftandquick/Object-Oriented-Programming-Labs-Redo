package Lecture16Part8;

/** I don't have the full package information, so I don't know what to do with it.  */
public interface ShapeInterface {

	/** Set the offset for the shape.  */
	public void setOffset(int newOffset);
	
	/** Returns the offset for the shape.  */
	public int getOffset();
	
	/** Draws the shape at lineNumber lines down from the current line.  */
	public void drawAt(int lineNumber); 
	
	/** Draw the shape at the current line.  */
	public void drawHere();
	
}

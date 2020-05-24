package Lecture9Part1;

public class Rectangle {
	
	/** While that's not always the case, instance variables of objects are almost always private.  In the RectangleDemo class, private instance 
	 * variables (i.e. recArea.length) cannot be used because it only works within the Rectangle class.  When instance variables are private, 
	 * we can use getter and setter to still utilize those variables.  */
	private int length; 
	private int width; 
	private int area; 

	/** Getter (accessor) and setter (mutator) are often used when instance variables are private.  
	 * This method is a setter.  It sets local variables equal to parameter variables.  */
	public void setArea(int getLength, int getWidth) {
		this.length = getLength;
		this.width = getWidth;
		
		System.out.println("Length is " + length + " units.  ");
		System.out.println("Width is " + width + " units.  ");

		this.area = length * width; 
	}
	
	/** This method is a getter.  It returns an integer.  */
	public int getArea() {
		return area;
	}

}

package Lecture16Part3;

public class Rectangle implements Measurable {

	private int length, width;
	
	Rectangle() {
	}
	
	Rectangle(int rLength, int rWidth) {
		length = rLength; 
		width = rWidth; 
	}
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int rLength) {
		this.length = rLength;
	}

	public int getWidth() {
		return width;
	}
	
	public void setWidth(int rWidth) {
		this.width = rWidth;
	}
	
	public String toString() {
		return "Rectangle[length = " + length + ", width = " + width + "]";
	}
	
	public double getArea() {
		return length * width;
	}
	
	public double getPerimeter() {
		return length * 2 + width * 2; 
	}
	
}

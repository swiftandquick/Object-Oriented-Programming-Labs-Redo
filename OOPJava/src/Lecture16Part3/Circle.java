package Lecture16Part3;

public class Circle {

	private int radius;
	
	Circle() {
	}
	
	Circle(int rRadius) {
		radius = rRadius;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int rRadius) {
		this.radius = rRadius;
	}
	
	public String toString() {
		return "Circle[radius = " + radius + "]"; 
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	public double getPerimeter() {
		return radius * 2 * Math.PI; 
	}
	
}

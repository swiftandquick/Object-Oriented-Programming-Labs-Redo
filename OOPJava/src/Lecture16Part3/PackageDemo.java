package Lecture16Part3;

public class PackageDemo {

	public static void main(String args[]) {
		
		Rectangle rectangle = new Rectangle(2, 4);
		
		System.out.println(rectangle);
		System.out.println("Area:  " + rectangle.getArea()); 
		System.out.println("Perimeter:  " + rectangle.getPerimeter());
		
		Circle circle = new Circle(3);
		
		System.out.println(circle);
		System.out.println("Area:  " + circle.getArea());
		System.out.println("Perimeter:  " + circle.getPerimeter()); 
		
	}
	
}

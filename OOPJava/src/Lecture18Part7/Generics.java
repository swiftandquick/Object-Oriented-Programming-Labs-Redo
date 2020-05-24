package Lecture18Part7;

/**
 * Class definitions may include parameter for types, this is called generics.
 * The type parameter is usually but not always represented by <T>.  The idea
 * allows type to be a parameter to methods, classes, and interfaces.
 */
public class Generics<T> {

	private T data;

	Generics(T rData) {
		data = rData; 
	}

	public void setData(T rData) {
		this.data = rData;
	}
	
	public T getData() {
		return data;
	}
	
}

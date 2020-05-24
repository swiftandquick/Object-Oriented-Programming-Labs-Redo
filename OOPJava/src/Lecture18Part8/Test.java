package Lecture18Part8;

/** */
public class Test <A, B> {

	A firstType; 
	B secondType; 
	
	Test(A first, B second) {
		this.firstType = first;
		this.secondType = second; 
	}
	
	public void print() {
		System.out.println(firstType);
		System.out.println(secondType);
	}
	
}

package Project3Problem2;

public class DogDemo {

	public static void main(String args[]) {
		
		Dog dog1 = new Dog(); 
		Dog dog2 = new Dog(); 
		
		System.out.println("Dog #1 information:  ");
		dog1.takeInput();

		System.out.println("Dog #2 information:  ");
		dog2.takeInput();
		
		if(dog1.equals(dog2)) {
			System.out.println("The two dogs are the same!  ");
		}
		else {
			System.out.println("The two dogs are different!  ");
		}
		
	}
	
}

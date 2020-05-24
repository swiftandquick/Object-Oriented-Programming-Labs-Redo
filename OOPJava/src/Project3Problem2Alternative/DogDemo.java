package Project3Problem2Alternative;

public class DogDemo {

	public static void main(String args[]) {
		
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		
		System.out.println("Dog #1:  ");
		dog1.setName();
		dog1.setBreed();
		dog1.setAge();

		System.out.println("Dog #2:  ");
		dog2.setName();
		dog2.setBreed();
		dog2.setAge();
		
		if (dog1.getName().equalsIgnoreCase(dog2.getName()) && 
				dog1.getBreed().equalsIgnoreCase(dog2.getBreed()) && 
				dog1.getAge() == dog2.getAge()) {
			System.out.println("Same dogs!  ");
		}
		else {
			System.out.println("Different dogs!  ");
		}
		
	}
	
}

package Project8;

public class PackageDemo {

	public static void main(String args[]) {
		
		/** Use constructor to set attributes for pet1.  */
		Pet pet1 = new Pet("Jesse", 5, 10.5);
		System.out.println(pet1);
		
		/** Create an empty object pet2, then set the attributes via setters.  */
		Pet pet2 = new Pet();
		
		pet2.setName("Cree");
		pet2.setAge(6);
		pet2.setWeight(10.2);
		
		System.out.println("Name:  " + pet2.getName());
		System.out.println("Age:  " + pet2.getAge());
		System.out.println("Weight:  " + pet2.getWeight());
		
		/**
		 * Create another Pet object class pet3 using polymorphism, pet3 acts as a Dog
		 * object, as pet3 gain access all of Dog class' methods.
		 */		
		Pet pet3 = new Dog("Husky", "blue", "John", 7, 12.3);
		System.out.println(pet3);
		
		/** Downcast pet3 to dog1, now dog1 is a real Dog object.  */
		Dog dog1 = (Dog) pet3;
		System.out.println(dog1);
		
		/** Set up the dog2 object.  */
		Dog dog2 = new Dog("Poodle", "red", "John", 7, 12.3);
		System.out.println(dog2); 
		
		/** It should be false because breed and color are different.  */
		System.out.println("Are dog1 and dog2 the same?  " + dog1.equals(dog2));  
		
		/** Use setter to change breed and color.  */
		dog2.setBreed("Husky");
		dog2.setColor("blue");
		
		System.out.println("Dog 2's New Breed:  " + dog2.getBreed());
		System.out.println("Dog 2's New Color:  " + dog2.getColor());
		
		/** Now check again.  */
		System.out.println(dog1);
		System.out.println(dog2);
		System.out.println("Are dog1 and dog2 the same?  " + dog1.equals(dog2));  
		
	}
	
}

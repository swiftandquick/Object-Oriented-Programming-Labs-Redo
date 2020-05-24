package Project8;

/**
 * Dog is the derived class of Pet. Dog inherits all non-private variables and
 * methods from Pet.
 */
public class Dog extends Pet {
	
	private String breed; 
	private String color; 
	
	Dog() {
	}
	
	Dog(String initialBreed, String initialColor) {
		breed = initialBreed; 
		color = initialColor; 
	}
	
	Dog(String initialBreed, String initialColor, Pet initialPet) {
		breed = initialBreed; 
		color = initialColor; 
	}
	
	Dog(String initialBreed, String initialColor, String initialName, int initialAge, double initialWeight) {
		super(initialName, initialAge, initialWeight);
		breed = initialBreed; 
		color = initialColor; 
	}
	
	public String getBreed() {
		return breed; 
	}
	
	public void setBreed(String newBreed) {
		this.breed = newBreed; 
	}
	
	public String getColor() {
		return color; 
	}
	
	public void setColor(String newColor) {
		this.color = newColor; 
	}
	
	public String toString() {
		return "Dog[" + super.toString() + ", breed = " + breed + ", color = " + color + "]";
	}
	
	public String Howl() {
		return "woof";
	}
	
	/** Check if the two dogs are the same.  */
	public boolean equals(Dog another) {
		if(this.breed.equalsIgnoreCase(another.breed) && this.color.equalsIgnoreCase(another.color) && 
				this.getName().equalsIgnoreCase(another.getName()) & this.getAge() == another.getAge()
				&& this.getWeight() == another.getWeight()) {
			return true;
		}
		else {
			return false;
		}
	}

}
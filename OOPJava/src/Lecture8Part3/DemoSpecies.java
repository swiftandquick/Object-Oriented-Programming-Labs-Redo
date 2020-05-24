package Lecture8Part3;

public class DemoSpecies {

	private String name;
	private int population; 
	private double growthRate; 
	
	public void setSpecies(String name2, int population2, double growthRate2) {
		this.name = name2;
		this.population = population2;
		this.growthRate = growthRate2;
	}
	

	public void writeOutput() {
		System.out.println("Name = " + this.name);  
		System.out.println("Population = " + this.population);  
		System.out.println("Growth Rate = " + this.growthRate + "%");  
	}
	
	/** 
	 * Tries to set intVariable equal to the population of this object.  But arguments of a primitive type cannot be changed.  
	 */
	public void tryToChange(int intVariable) {
		intVariable = this.population;
	}
	
	/**
	 * Tries to make otherObject reference this object.  But arguments of a class type cannot be replaced.  
	 */
	public void tryToReplace(DemoSpecies otherObject) {
		otherObject = this; 
	}
	
	/**
	 * Changes the data in otherObject to the data in this object, which is unchanged.  An argument of a class type can change in state.  
	 */
	 public void change(DemoSpecies otherObject) {
		 otherObject.name = this.name;
		 otherObject.population = this.population; 
		 otherObject.growthRate = this.growthRate; 
	 }
	
}

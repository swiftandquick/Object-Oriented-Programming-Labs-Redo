package Lecture15AndLecture16;

public class PackageDemo {

	public static void main(String args[]) {
		
		Person person1 = new Person("Jim");
		Person person2 = new Person("Jim"); 
		Person person3 = new Person("Jon"); 
		
		person1.writeOutput(); 
		person2.writeOutput(); 
		person3.writeOutput(); 
		
		/** Check if person1 and person3 are the same.  */
		System.out.println(person1.sameName(person2)); // true 
		System.out.println(person1.sameName(person3)); // false
		
		/**
		 * Methods are being invoked based on signatures, so if I pass in no argument, I
		 * will invoke the constructor with no argument. If I pass in 2 arguments, then
		 * I will invoke the constructor with 2 arguments.  This is called overloading, 
		 * method invocation is based on the method signature.  
		 */
		Student student1 = new Student();
		Student student2 = new Student(1005);
		Student student3 = new Student("Jamie", 1010);
	
		/**
		 * student1 has no initialized variables, so I can give him some. Since Student
		 * inherits from Person, Student objects can invoke methods from Person class.  
		 */
		student1.setName("Sam"); 
		student1.setStudentId(1005);
		student2.setName("Sam");
		
		/**
		 * Since student1 and student2 are Student objects, they will invoke the
		 * subclass' method writeOutput() despite the superclass (Person) also has the
		 * method of same name.  This is call override.  
		 */
		student1.writeOutput(); 
		student2.writeOutput(); 
		student3.writeOutput();
		
		/** Compare to see if they are the same students.  */
		System.out.println(student1.sameStudent(student2)); // true
		System.out.println(student1.sameStudent(student3)); // false
		
		/** Use reset method to set the name, ID, and level of the undergraduates.  */
		Undergraduate undergraduate1 = new Undergraduate();
		Undergraduate undergraduate2 = new Undergraduate();
		
		undergraduate1.reset("Winston", 1020, 2);
		undergraduate2.reset("Winston", 1020, 2);
		
		undergraduate1.writeOutput();
		undergraduate2.writeOutput();
		
		/** Compare the two undergraduates, set a new level for undergraduate2, compare again.  */
		System.out.println(undergraduate1.sameUndergraduate(undergraduate2)); // true
		undergraduate2.setLevel(3);
		
		undergraduate1.writeOutput();
		undergraduate2.writeOutput();
		System.out.println(undergraduate1.sameUndergraduate(undergraduate2)); // false

		/**
		 * Creates an array containing 4 Person objects. The following is an example of
		 * polymorphism. Since Student and Undergraduate have Person as the ancestor
		 * class, that means Student and Undergraduate are types of Person. Therefore,
		 * we can assign them to Person variables. 
		 */
		Person[] people = new Person[4];
		people[0] = new Person("Jamie");
		people[1] = new Person("Eric");
		people[2] = new Student("Steven", 3030);
		people[3] = new Undergraduate("Alex", 3033, 3);
		
		/**
		 * Different object invokes different writeOutput() methods. For example,
		 * Student objects that are assign to Person variables will invoke Student
		 * class' writeOutput() methods.
		 */
		for (int i = 0; i < people.length; i++) {
			people[i].writeOutput();
		}
		
	}
	
}

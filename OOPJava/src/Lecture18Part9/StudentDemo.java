package Lecture18Part9;

public class StudentDemo {

	public static void main(String args[]) {
		
		/** Student became base type.  */
		Student <String, Integer, Integer> student = new Student <String, Integer, Integer> ("Megan", 90, 91);
		
		System.out.println("Name:  " + student.getName());
		System.out.println("Exam 1 Grade:  " + student.getExamGrade1());
		System.out.println("Exam 2 Grade:  " + student.getExamGrade2());
		
		/** Alternatively, I can pass in strings for grade, since the type isn't locked.  */
		Student <String, String, String> student2 = new Student <String, String, String> ("Ling", "Eighty", "Ninety");
		System.out.println("Name:  " + student2.getName());
		System.out.println("Exam 1 Grade:  " + student2.getExamGrade1());
		System.out.println("Exam 2 Grade:  " + student2.getExamGrade2());
		
	}
	
}

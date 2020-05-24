package Lecture15AndLecture16;

public class Student extends Person {

	public int studentId;
	
	Student() {
	}
	
	Student(int rStudentId) {
		studentId = rStudentId; 
	}
	
	Student(String rName, int rStudentId) {
		super(rName);
		studentId = rStudentId; 
	}
	
	public int getStudentId() {
		return studentId;
	}
	
	public void setStudentId(int rStudentId) {
		this.studentId = rStudentId;
	}
	
	public boolean sameStudent(Student another) {
		if (this.sameName(another) && this.studentId == another.studentId) {
			return true; 
		}
		else {
			return false; 
		}
	}
	
	/** Use super keyword to call an overridden method.  */
	public void writeOutput() {
		super.writeOutput();
		System.out.println("Student ID:  " + studentId);
	}
	
}

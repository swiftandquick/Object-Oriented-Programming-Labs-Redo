package Lecture18Part9;

public class Student <A, B, C> {

	private A name;
	private B examGrade1;
	private C examGrade2;
	
	Student (A rName, B rExamGrade1, C rExamGrade2) {
		name = rName;
		examGrade1 = rExamGrade1;
		examGrade2 = rExamGrade2;
	}
	
	public void setName(A rName) {
		this.name = rName;
	}
	
	public A getName() {
		return name;
	}
	
	public void setExamGrade1(B rExamGrade1) {
		this.examGrade1 = rExamGrade1;
	}
	
	public B getExamGrade1() {
		return examGrade1;
	}
	
	public void setExamGrade2(C rExamGrade2) {
		this.examGrade2 = rExamGrade2;
	}
	
	public C getExamGrade2() {
		return examGrade2;
	}
	
}

package Lecture15AndLecture16;

public class Undergraduate extends Student {

	private int level;
	
	Undergraduate() {
	}
	
	Undergraduate(String rName, int rStudentId, int rLevel) {
		super(rName, rStudentId);
		level = rLevel;
	}
	
	public void reset(String rName, int rStudentId, int rLevel) {
		setName(rName);
		setStudentId(rStudentId);
		this.level = rLevel;
	}
	
	public int getLevel() {
		return level;
	}
	
	public void setLevel(int rLevel) {
		this.level = rLevel; 
	}
	
	public void writeOutput() {
		super.writeOutput();
		System.out.println("Level:  " + level);
	}
	
	public boolean sameUndergraduate(Undergraduate another) {
		if (this.sameStudent(another) && this.level == another.level) {
			return true; 
		}
		else {
			return false; 
		}
	}
	
}

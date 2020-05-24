package Project9;

public class TimeDemo {

	public static void main(String args[]) {
		
		Time time1 = new Time(15, 45);
		Time time2 = new Time(12, 21);		
		Time time3 = new Time(-1, 13);		
		Time time4 = new Time(13, -1);		
		Time time5 = new Time(24, 42);		
		Time time6 = new Time(6, 60);		
		Time time7 = new Time(8, 16);		
		Time time8 = new Time(9, 17);
		
		time1.testResult();
		time2.testResult();
		time3.testResult();
		time4.testResult();
		time5.testResult();
		time6.testResult();
		time7.testResult();
		time8.testResult();
		
	}
	
}

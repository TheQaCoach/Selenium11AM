package classes;
public class CreateStudentRecord {
	
	public StudentsRecord createStudentRecord(int rnum,String name,float per,char grade) {
		StudentsRecord sr = new StudentsRecord();
		sr.rollNumber = rnum;
		sr.name = name;
		sr.percentage = per;
		sr.grade = grade;
		return sr;
	}
	
	public void getStudentRecord(StudentsRecord sr) {
		System.out.println(sr.rollNumber);
		System.out.println(sr.name);
		System.out.println(sr.percentage);
		System.out.println(sr.grade);	
	}
}
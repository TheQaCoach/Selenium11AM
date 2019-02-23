package classes;
public class GetStudentRecord {
	public static void main(String ar[]) {
		CreateStudentRecord csr = new CreateStudentRecord();
		StudentsRecord sr_new = csr.createStudentRecord(12,"Amit",55.55f,'c');
		csr.getStudentRecord(sr_new);
		
		StudentsRecord sr_new2 = csr.createStudentRecord(13,"Vijay",60.55f,'b');
		csr.getStudentRecord(sr_new2);
		
	}
}
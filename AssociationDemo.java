package association;
class Student{
	int regNo;
	String studentName;
	Faculty obj;//has-a relationship
	public Student(int regNo, String studentName, Faculty obj) {
		super();
		this.regNo = regNo;
		this.studentName = studentName;
		this.obj = obj;
	}
	@Override
	public String toString() {
		return "Student [regNo=" + regNo + ", studentName=" + studentName + ", obj=" + obj + "]";
	}
}
class Faculty{
	String facultyName;
	String subjectName;
	public Faculty(String facultyName, String subjectName) {
		super();
		this.facultyName = facultyName;
		this.subjectName = subjectName;
	}
	@Override
	public String toString() {
		return "Faculty [facultyName=" + facultyName + ", subjectName=" + subjectName + "]";
	}
}

public class AssociationDemo {

	public static void main(String[] args) {
		Faculty kvr = new Faculty("KVR","Python");
		Student s1 = new Student(1,"Oracle",kvr);
		Student s2 = new Student(2,"Python",kvr);
		System.out.println(s1);
		System.out.println(s2);

	}

}

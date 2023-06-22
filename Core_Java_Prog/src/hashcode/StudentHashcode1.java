package hashcode;

public class StudentHashcode1 {
	
	static void assign(Student s1) {

		Student s2=new Student();
		s1 = s2;
		s1.setId(10);
		System.out.println("asgn : s1 hashcode : " + s1.hashCode() + ", " + "s2 hashcode : " + s2.hashCode());
	}

	public static void main(String[] args) {
		Student s1=new Student();
		assign(s1);
		System.out.println("main : s1 hashcode : " + s1.hashCode());

	}
}

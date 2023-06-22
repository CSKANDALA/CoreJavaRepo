package cloning;

public class StudentShallowCopy {

	static void assign(Student s1) {

		Student s2 = new Student();
		s2 = s1;
		System.out.println("asgn : s1 hashcode : " + s1.hashCode() + ", " + "s2 hashcode : " + s2.hashCode());
		s2.setId(20);
		System.out.println("asgn : id : " + s1.getId()+", "+s2.getId());

	}

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setId(10);
		System.out.println("main : s1 hashcode : " + s1.hashCode());
		System.out.println("main : id : " + s1.getId());
		assign(s1);
		System.out.println("main : id 2 : " + s1.getId());

	}
}

package cloning;

public class StudentClone {

	static void assign(CloneStudent s1) throws CloneNotSupportedException {

		CloneStudent s2 = new CloneStudent();
		s2=(CloneStudent) s1.clone();
		
		System.out.println("asgn : s1 hashcode : " + s1.hashCode() + ", " + "s2 hashcode : " + s2.hashCode());
		s2.setId(20);
		System.out.println("asgn : id : " + s1.getId() + ", " + s2.getId());

	}

	public static void main(String[] args) throws CloneNotSupportedException {
		CloneStudent s1 = new CloneStudent();
		s1.setId(10);
		System.out.println("main : s1 hashcode : " + s1.hashCode());
		System.out.println("main : id : " + s1.getId());
		assign(s1);
		System.out.println("main : id 2 : " + s1.getId());

	}
}

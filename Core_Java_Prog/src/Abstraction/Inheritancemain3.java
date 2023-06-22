package Abstraction;

public class Inheritancemain3 extends Inheritance3{
	int sfriends;
	int sbooks;
	void studentstudentt() {
		System.out.println("student number : "+sno);
		System.out.println("student name : "+sname);
		System.out.println("student marks : "+smarks);
		System.out.println("student friends : "+sfriends);
		System.out.println("student books : "+sbooks);
		
	}
	public static void main(String[] args) {
		Inheritancemain3 s=new Inheritancemain3();
		s.sno=434;
		s.sname="kesava";
		s.smarks=90;
		s.sfriends=10;
		s.sbooks=5;
        s.studentstudentt();
	}

	
}

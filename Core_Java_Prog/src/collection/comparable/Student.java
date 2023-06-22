package collection.comparable;

public class Student implements Comparable<Student> {

	private int rollNum = 0;
	private String name = "";

	public Student(int rollNum, String name) {
		super();
		this.rollNum = rollNum;
		this.name = name;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNum=" + rollNum + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student obj2) {
		System.out.println("--->"+this.rollNum+", "+obj2.rollNum);
		if (this.rollNum > obj2.rollNum)
			return 1;
		if (this.rollNum < obj2.rollNum)
			return -1;
		if (this.rollNum == obj2.rollNum)
			return 0;
		return 0;
	}

}

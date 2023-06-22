package collection.comparator;

public class Student1_8 {

	private Integer rollNum = 0;
	private String name = "";

	public Student1_8(Integer rollNum, String name) {
		super();
		this.rollNum = rollNum;
		this.name = name;
	}

	public Integer getRollNum() {
		return rollNum;
	}

	public void setRollNum(Integer rollNum) {
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
}

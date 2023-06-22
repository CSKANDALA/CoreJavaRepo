package Interviewpurpose;

public class twoclassextend extends twoclass {
	int a = 200;

	void test() {
		System.out.println("B");
	}

	public static void main(String args[]) {

		twoclass obj = new twoclassextend();
		obj.test();
		System.out.println(obj.a);

	}

}

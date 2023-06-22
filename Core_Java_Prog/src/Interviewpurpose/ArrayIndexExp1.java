package Interviewpurpose;

public class ArrayIndexExp1 {

	int array[] = { 20, 30 };

	void method() {
		try {
			int a1 = array[2];
			System.out.println("The value of array is : " + a1);
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array error" + e);
		}
	}

	public static void main(String args[]) {
		ArrayIndexExp1 e = new ArrayIndexExp1();
		e.method();
	}
}

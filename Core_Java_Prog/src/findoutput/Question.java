package findoutput;

public class Question {
	public static void main(String args[]) {

		int x = 2;
		if (x = 2) {
			System.out.println("Both number are equal");
		}
	}
}

// Out
// Compile : No , Error at line 6
// Reason : Type mismatch , can not convert from int to boolean
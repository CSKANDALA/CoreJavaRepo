package Interviewpurpose;

public class equalsmethod {
	public static void main(String args[]) {

		String a = "abcd";
		String b = new String("abcd");
		if (a.equals(b)) {
			if (a == b) {
				System.out.println(a.charAt(0));
			} else {
				System.out.println(a.charAt(1));
			}
		} else {
			if (a == b) {
				System.out.println(a.charAt(2));
			} else {
				System.out.println(a.charAt(3));
			}
		}

	}
}

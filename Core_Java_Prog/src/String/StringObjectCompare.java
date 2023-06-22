package String;

public class StringObjectCompare {

	public static void main(String args[]) {

		String s1 = new String("abc");
		String s2 = new String("abc");

		String s3 = "abc";
		String s4 = "abc";

		System.out.println("comparision 1: " + (s1 == s2));
		System.out.println("comparision 2 : " + s1.equals(s2));
		System.out.println("comparision 3 : " + (s3 == s4));
		System.out.println("comparision 4 : " + s3.equals(s2));

	}

}

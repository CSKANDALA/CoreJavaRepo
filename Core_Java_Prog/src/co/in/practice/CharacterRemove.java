package co.in.practice;

public class CharacterRemove {

	public static void main(String[] args) {

		String s = "kesava";
		//char[] c=s.toCharArray();
		//s.substring(0)==c[0]
		System.out.println(s.substring(0));
		System.out.println(s.substring(3));
		//s.substring(?,4)==c[4-1]
		System.out.println(s.substring(2, 4));
	}

}

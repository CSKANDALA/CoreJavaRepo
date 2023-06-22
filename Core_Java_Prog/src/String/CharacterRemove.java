package String;

public class CharacterRemove {

	public static String removecharAt(String s, int pos) {
		return s.substring(0, pos) + s.substring(pos + 1);
	}

	public static void main(String[] args) {

		String s = "kesava";
		//char[] c=s.toCharArray();
		//s.substring(0)==c[0]
		System.out.println(s.substring(0));
		System.out.println(s.substring(3));
		//s.substring(?,4)==c[4-1]
		System.out.println(s.substring(2, 4));//see above senario 1st num -> remove upto and 2nd ->keep upto
		
		String str = "this is kesava";
		System.out.println(removecharAt(str, 3));
	}

}

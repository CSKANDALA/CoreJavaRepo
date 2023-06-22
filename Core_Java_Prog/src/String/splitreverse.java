package String;

public class splitreverse {
	public static void main(String args[]) {
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String s1[];
		String s2 = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			s2 += s.charAt(i);
		}
		System.out.println(s2);

		String reverse = new StringBuffer(s).reverse().toString();
		System.out.println(reverse);

		s1 = s2.split("");
		for (int j = 0; j < s1.length; j++) {
			System.out.println(s1[j]);
		}

	}

}

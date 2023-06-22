package String;

public class Stringreversesplit {

	public static void main(String args[]) {
		int count = 0;
		String string = "hi kesava";
		String result = "";
		String s[];
		for (int i = string.length() - 1; i >= 0; i--) {
			result = result + string.charAt(i);
		}

		System.out.println(result);
		s = result.split(" ");
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
			count++;
		}
		System.out.println("count : " + count);

	}
}

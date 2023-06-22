package String;

public class ReverseEachWord {

	public static void main(String[] args) {
		String s1 = "kesava kandala";
		String[] s2 = s1.split(" ");
		for (String s3 : s2) {
			String word = s3;
			for (int i = word.length() - 1; i >= 0; i--) {
				System.out.print(word.charAt(i));
			}
			System.out.print(" ");
		}
	}

}

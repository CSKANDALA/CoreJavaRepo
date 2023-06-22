package co.in.practice;

public class StringReverse {

	public void reverse1() {

		String s1 = "my name is kesava";
		String[] words = s1.split(" ");
		String reverse = "";
		for (int i = 0; i < words.length; i++) {
			char[] characters = words[i].toCharArray();

			for (int j = characters.length - 1; j >= 0; j--) {
				reverse = reverse + characters[j];
			}
			reverse = reverse + " ";
		}
		System.out.println("reverse : " + reverse);
	}

	public static void main(String[] args) {
		StringReverse stringReverse = new StringReverse();
		stringReverse.reverse1();
	}
}

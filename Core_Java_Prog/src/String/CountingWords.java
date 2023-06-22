package String;

public class CountingWords {

	public static void main(String[] args) {

		String s="ke sa va";
		s=s.replace(" ", "");
		System.out.println("---->"+s);
		
		String s1 = "hi kesava holloworld";
		String[] words = s1.trim().split(" ");
		System.out.println("Method :1--->Number of words in the string = " + words.length);

		int count = 0;
		for (String word : words) {
			count++;
		}
		System.out.println("Method :2--->Number of words in the string = " + count);
	}
}

package String;

public class Matches {
	public static void main(String[] args) {

		String value = "carrots";

		System.out.println(value.matches("c.*s"));
		System.out.println(value.matches("c.*t"));
		System.out.println(value.matches("carrots"));
		System.out.println(value.matches("carrts"));
	}

}

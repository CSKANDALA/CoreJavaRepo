package interviewprogram2;

public class removeWhiteSpace {

	static String removeWhiteSpaces(String input) {
		StringBuilder output = new StringBuilder();

		char[] charArray = input.toCharArray();

		for (char c : charArray) {
			if (!Character.isWhitespace(c))
				output.append(c);
		}

		return output.toString();
	}

	public static void main(String[] args) {
		String output = removeWhiteSpaces("kes ava");
		System.out.println("output : " + output);
		//Method 2
		String s="ab c";
		s=s.replace(" ", "");
		System.out.println(s);
	}
}

package String;

public class reverseStringsentence {
	public static void main(String args[]) {

		String input = "This is interview question";
		// Method : 1
		String[] str = input.split(" ");
		for (int i = str.length - 1; i >= 0; i--) {
			System.out.print(str[i]+" ");
		}

		// Method : 2
		System.out.println();
		String output = "";
		String[] array = input.split(" ");
		for (int i = array.length - 1; i >= 0; i--) {
			output += array[i];
			// if (i != 0) {
			output += " ";

			// }
		}
		System.out.println(output);
	}
}

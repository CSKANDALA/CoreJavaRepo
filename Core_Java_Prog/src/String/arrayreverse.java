package String;

public class arrayreverse {

	public static void main(String[] args) {

		String input = "10,15,20,25,30";
		String[] inputArray = input.split(",");
		for (int i = inputArray.length - 1; i >= 0; i--) {
			System.out.print(inputArray[i]+" ");
		}
		
		
		/*int[] inputIntArray = new int[inputArray.length];
		for (int i = 0; i < inputArray.length; i++) {
			inputIntArray[i] = Integer.valueOf(inputArray[i]);
		}

		for (int j = inputIntArray.length - 1; j >= 0; j--) {
			System.out.println("Integer reverse : " + inputIntArray[j]);
		}*/
	}
}

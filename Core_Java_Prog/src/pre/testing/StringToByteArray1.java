package pre.testing;

import java.util.Arrays;

public class StringToByteArray1 {
	public static void main(String[] args) {
		String str = "PANKAJ";
		byte[] byteArr = str.getBytes();
		// print the byte[] elements
		System.out.println("String to byte array: " + Arrays.toString(byteArr));
	}
}

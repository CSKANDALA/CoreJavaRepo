package pre.testing;

import java.util.Base64;

public class StringContains {
	public static void main(String[] args) {

		boolean characterCheckString = false;
		String myString = "abcde";
		if (myString.contains("f")) {
			characterCheckString = true;
		}
		byte[] b1 = myString.getBytes();
		System.out.println("------------>" + characterCheckString);

		String abc = "[B@3a883ce7";
		byte[] b = abc.getBytes();
		System.out.println("------------>" + b + " ------------>" + b1);
		System.out.println("=========>"+new String(b));
	}
}

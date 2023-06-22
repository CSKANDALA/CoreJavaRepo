package conversions;

public class Binary_Octal_Hex_To_Decimal {

	public static void main(String[] args) {

		String binaryNumber = "10101";
		System.out.println(binaryNumber + " in Base 10 : " + Integer.parseInt(binaryNumber, 2));

		String octalNumber = "456";
		System.out.println(octalNumber + " in Base 10 : " + Integer.parseInt(octalNumber, 8));

		String hexNumber = "ABCD";
		System.out.println(hexNumber + " in Base 10 : " + Integer.parseInt(hexNumber, 16));
	}
}

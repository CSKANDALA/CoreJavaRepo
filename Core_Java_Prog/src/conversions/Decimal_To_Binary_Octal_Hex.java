package conversions;

public class Decimal_To_Binary_Octal_Hex {

	public static void main(String[] args) {

		Integer decimal1 = 21;
		System.out.println("M1 -->"+decimal1 + " in Base 2 : " + Integer.toString(decimal1, 2));
		System.out.println("M2 -->"+decimal1 + " in Base 2 : " + Integer.toBinaryString(decimal1));
		
		Integer decimal2 = 302;
		System.out.println("M1 -->"+decimal2 + " in Base 8 : " + Integer.toString(decimal2, 8));
		System.out.println("M2 -->"+decimal2 + " in Base 8 : " + Integer.toOctalString(decimal2));

		Integer decimal3 = 43981;
		System.out.println("M1 -->"+decimal3 + " in Base 16 : " + Integer.toString(decimal3, 16));
		System.out.println("M2 -->"+decimal3 + " in Base 16 : " + Integer.toHexString(decimal3));
	}
}

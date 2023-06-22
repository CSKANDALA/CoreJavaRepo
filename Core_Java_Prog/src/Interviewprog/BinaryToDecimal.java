package Interviewprog;

public class BinaryToDecimal {

	public int getDecimalFromBinary(int binary) {

		int decimal = 0;
		int power = 0;
		
		/*while (true) {
			if (binary == 0) {
				break;
			} else {
				int remainder = binary % 10;
				double mathPower=Math.pow(2, power);
				decimal += remainder * mathPower;
				binary = binary / 10;
				power++;
			}
		}*/
		
		while(binary>0) {
			
			int remainder = binary % 10;
			double mathPower=Math.pow(2, power);
			decimal += remainder * mathPower;
			binary = binary / 10;
			power++;
		}
		
		return decimal;
	}

	public static void main(String a[]) {
		BinaryToDecimal bd = new BinaryToDecimal();
		System.out.println("11 ===> " + bd.getDecimalFromBinary(11));
		System.out.println("110 ===> " + bd.getDecimalFromBinary(110));
		System.out.println("100110 ===> " + bd.getDecimalFromBinary(100110));
	}

}

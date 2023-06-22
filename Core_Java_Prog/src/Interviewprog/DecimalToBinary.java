package Interviewprog;

public class DecimalToBinary {

	public void printBinaryFormat(int number) {
		
		System.out.println("test:  " + number);
		int binary[] = new int[20];
		int index = 0;
		int remainder=0;
		while (number > 0) {
			
			remainder = number % 2;
			 binary[index++]=remainder;
			number = number / 2;
		}
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}
	}

	public static void main(String a[]) {
		DecimalToBinary dtb = new DecimalToBinary();
		dtb.printBinaryFormat(10);
	}

}

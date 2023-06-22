package generalconcepts;

import java.util.Scanner;

public class Addition {
	int i;
	int j;
	int k = 0;

	public void method() {
		System.out.println("Enter i values:");
		Scanner in = new Scanner(System.in);
		i = in.nextInt();
		System.out.println("Enter j values:");
		Scanner in1 = new Scanner(System.in);
		j = in1.nextInt();

		k = i + j;
		System.out.println("sum is:" + k);
	}

	public static void main(String[] args) {
		Addition sum = new Addition();
		sum.method();
	}
}

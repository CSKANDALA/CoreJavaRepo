package co.in.practice;

import java.util.HashMap;
import java.util.Map;

public class Learning_1 {
	public static void main(String[] args) {

		int a = 0, b = 1, c = 0;
		System.out.print(a + " " + b + " ");
		for (int i = 0; i <= 5; i++) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}

}
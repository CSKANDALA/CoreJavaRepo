package co.in.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {
	public static void main(String[] args) {

		int a[] = { 5, 3, 7, 2, 1,3 };
		int temp;
		/*for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}*/
		
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+", ");
		}
		//System.out.println("---->" + Arrays.toString(a));
	}
}

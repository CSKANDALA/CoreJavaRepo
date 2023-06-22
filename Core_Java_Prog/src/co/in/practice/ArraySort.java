package co.in.practice;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {

		int[] array = { 5, 3, 9, 2, 7 };

		int temp;
		for (int i = 0; i < array.length; i++) {
			
			for (int j = i+1; j < array.length; j++) {
				temp = 0;
				if (array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
					
				}
				//System.out.println("--->"+Arrays.toString(array)+"->"+i+", "+j);
			}

		}
		System.out.println("===>"+Arrays.toString(array));
	}
}

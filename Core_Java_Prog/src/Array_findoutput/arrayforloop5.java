package Array_findoutput;

public class arrayforloop5 {
	public static void main(String a[]) {
		int[] arr1 = { 4, 7, 3, 9, 2 };
		int[] arr2 = { 3, 2, 12, 9, 40, 32, 4 };
		// System.out.println("aa "+arr1.length);
		// System.out.println("bb "+arr2.length);
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				// System.out.println("ee "+arr2[j]);
				if (arr1[i] == arr2[j]) {
					System.out.println("duplicate :  " + arr2[j]);
					// System.out.println("dd "+arr1[i]);
				}
			}
		}
	}
}

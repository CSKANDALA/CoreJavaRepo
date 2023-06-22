package Array;

public class Remove_DuplicateValues {

	public static void main(String[] args) {
		int i = 0;
		int j = 1;

		int[] array = { 1, 2, 2, 3, 4, 4, 4, 5, 6 };
		while (j < array.length) {
			if (array[j] == array[i]) {
				j++;
			} else {
				array[++i] = array[j++];
			}

			int[] output = new int[i + 1];
			for (int k = 0; k < output.length; k++) {
				output[k] = array[k];
			}
			for (int m : output) {
				System.out.print(m + " ");
			}
		}
	}
}

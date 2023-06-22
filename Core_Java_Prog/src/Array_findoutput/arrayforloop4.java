package Array_findoutput;

public class arrayforloop4 {
	public static void main(String[] args) {
		int[] array = new int[101];
		for (int i = 0; i < array.length; i++)
			array[i] = i;
		int sum = 0;
		for (int x : array) {
			sum += x;
			System.out.println(sum);
		}
		System.out.println(sum);
	}

}

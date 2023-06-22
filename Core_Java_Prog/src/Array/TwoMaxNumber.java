package Array;

public class TwoMaxNumber {
	//Wrong
	public void printTwoMaxNumbers(int[] nums) {
		int maxOne = 0;
		int maxTwo = 0;
		for (int n : nums) {
			if (n > maxOne) {
				maxTwo = maxOne;
				maxOne = n;
			} else if (n > maxTwo) {
				maxTwo = n;
			}
		}
		System.out.println("First Max Number: " + maxOne);

		System.out.println("Second Max Number: " + maxTwo);
	}

	public static void main(String a[]) {
		int num[] = { 10, 5, 20, 3, 100, 50 };
		TwoMaxNumber tmn = new TwoMaxNumber();
		tmn.printTwoMaxNumbers(num);
	}
}

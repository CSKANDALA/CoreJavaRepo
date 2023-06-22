package pre.testing;

import java.util.Random;

public class RandomIntDouble {

	Random r = new Random();

	public int randomValue(int min, int max) {
		return (r.nextInt(max - min + 1) + min);
	}

	public double randomDoubleValue(double min, double max) {
		return min + (max - min) * r.nextDouble();
	}

	public static void main(String[] args) {

		RandomIntDouble obj = new RandomIntDouble();
		System.out.println("--->Random int value    : " + obj.randomValue(10, 20));
		System.out.println("--->Random double value : " + obj.randomDoubleValue(10.0, 20.0));

	}
}

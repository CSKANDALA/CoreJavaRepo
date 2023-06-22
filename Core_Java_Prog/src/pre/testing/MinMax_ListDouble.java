package pre.testing;

import java.util.ArrayList;
import java.util.List;

public class MinMax_ListDouble {

	public static void main(String[] args) {
		double min = Double.MAX_VALUE, max = Double.MIN_VALUE;
		List<Double> values = new ArrayList<Double>();
		values.add(17.5);
		values.add(12.5);
		values.add(15.5);
		
		for (double d : values) {
			if (d > max)
				max = d;
			if (d < min)
				min = d;

		}
		System.out.println("----->min : " + min + " ===>max : " + max);
	}
}

package pre.testing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class String_MinMax {

	public static void main(String[] args) {
		try {
			String[] gradesAsString = { "12.5", "14.5", "8.5", "43.5" };
			List<Double> grades = new ArrayList<>(gradesAsString.length);

			for (String grade : gradesAsString) {
				grades.add(Double.parseDouble(grade.trim()));
			}

			// Sort the collection and get the first (as min) and last (as max) is better
			// for performance
			Double max = Collections.max(grades);
			Double min = Collections.min(grades);
			System.out.println("------->min : " + min + "  ===>max : " + max);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

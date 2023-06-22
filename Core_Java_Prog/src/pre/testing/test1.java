package pre.testing;

import java.util.Calendar;

public class test1 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -1);
		System.out.println("Yesterday's date = "+ cal.getTime());
	}
}

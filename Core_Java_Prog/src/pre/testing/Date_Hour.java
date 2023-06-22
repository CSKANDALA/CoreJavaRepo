package pre.testing;

import java.util.Date;

public class Date_Hour {

	public static void main(String[] args) {

		long time = System.currentTimeMillis();
		Date date = new Date(time);
		int hours = date.getHours();
		System.out.println("----->hour " + hours);
	}
}

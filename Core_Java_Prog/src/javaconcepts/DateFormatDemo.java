package javaconcepts;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo {
	public static void main(String args[]) {
		SimpleDateFormat formatter = new SimpleDateFormat("MMM dd, yyyy");
		String dateInString = "Jan 1, 2015";
		try {

			Date date = formatter.parse(dateInString);
			System.out.println(date);
			System.out.println(formatter.format(date));

		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}

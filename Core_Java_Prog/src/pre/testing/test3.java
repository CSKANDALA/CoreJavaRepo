package pre.testing;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.swing.text.DateFormatter;

public class test3 {
	public static void main(String[] args) {

		LocalDate startdate, enddate, currentDate;

		startdate = LocalDate.of(2017, 02, 03);
		enddate = LocalDate.of(2017, 02, 07);

		currentDate = LocalDate.parse("05-02-2017", DateTimeFormatter.ofPattern("dd-MM-yyyy"));

		if (currentDate.isAfter(startdate)) {
			if (currentDate.isBefore(enddate)) {
				System.out.println("-outputttttt---->" + currentDate);
			}
		}

	}
}

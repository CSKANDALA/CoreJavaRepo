package pre.testing;

import java.sql.Date;

public class PastDate {
	public static void main(String[] args) {
		long DAY_IN_MS = 1000 * 60 * 60 * 24;
		System.out.println("---->"+new Date(System.currentTimeMillis() - (7 * DAY_IN_MS)));
		;
	}
}

package pre.testing;

import java.net.URL;
import java.net.URLConnection;

public class connectionAlivetest {

	private static boolean netIsAvailable() {
		try {
			final URL url = new URL("http://www.google.com");
			final URLConnection conn = url.openConnection();
			conn.connect();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public static void main(String[] args) {
		boolean conn = connectionAlivetest.netIsAvailable();
		System.out.println("------------>" + conn);
	}
}

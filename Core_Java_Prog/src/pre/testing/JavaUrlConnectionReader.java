package pre.testing;

import java.net.*;
import java.io.*;

public class JavaUrlConnectionReader {
	public static void main(String[] args) {
		String output = getUrlContents("http://localhost:8080/iot_socket_service/");
		System.out.println(output);
	}

	private static String getUrlContents(String theUrl) {
		StringBuilder content = new StringBuilder();

		try {

			URL url = new URL(theUrl);

			URLConnection urlConnection = url.openConnection();

			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

			String line;

			while ((line = bufferedReader.readLine()) != null) {
				content.append(line + "\n");
			}
			bufferedReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return content.toString();
	}
}

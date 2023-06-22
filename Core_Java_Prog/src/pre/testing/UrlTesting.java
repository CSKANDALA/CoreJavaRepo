package pre.testing;

import java.net.HttpURLConnection;
import java.net.URL;

public class UrlTesting {

	public static void main(String[] args) throws Exception {
		
		String urlString = "http://14.142.145.250:8000/ifttt_service/rest/thing/get";
		 URL u = new URL(urlString); 
		    HttpURLConnection huc =  (HttpURLConnection)  u.openConnection(); 
		    huc.setRequestMethod("GET"); 
		    huc.connect(); 
		    System.out.println("------->"+huc.getResponseCode());
	}
}

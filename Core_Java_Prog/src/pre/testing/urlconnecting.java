package pre.testing;

import java.net.URL;
import java.net.URLConnection;

public class urlconnecting {
public static void main(String[] args) {
	try {
	    URL myURL = new URL("http://example.com/");
	    URLConnection myURLConnection = myURL.openConnection();
	    myURLConnection.connect();
	} 
	catch (Exception e) { 
	  
}
}
}

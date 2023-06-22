package pre.testing;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

public class connectionAlivetest2 {

	public static void main(String[] args) throws Exception {

		Socket s = new Socket("192.168.1.17", 8080);
		System.out.println("======>" + s.getPort());

	}
}

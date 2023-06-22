package pre.testing;

import java.security.SecureRandom;

public class RandomByte {
public static void main(String[] args) {
	SecureRandom random = new SecureRandom();
	byte[] bytes = new byte[1];
	random.nextBytes(bytes);
	System.out.println(bytes[0]);
}
}

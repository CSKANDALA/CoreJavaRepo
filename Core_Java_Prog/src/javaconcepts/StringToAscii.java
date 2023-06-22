package javaconcepts;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringToAscii {
	public static void main(String args[]) {
		
		byte[] string = "KESAVA".getBytes(StandardCharsets.US_ASCII); 
		String asciiString = Arrays.toString(string);
		System.out.println(asciiString);
	}

}

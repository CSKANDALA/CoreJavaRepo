package javaconcepts;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class AsciiToChar {
	public static void main(String args[]) {
		
		//Ascii to Char
		int ascii=65;
		char c=(char)ascii;
		System.out.println(c);
		 //OR System.out.println((char)65);
		
		//Char to Ascii
		char character = 'k';    
		int ascii1 = (int) character;
		System.out.println(ascii1);
		
		//String to Ascii method :1 
		/*byte[] ascii = "kesava".getBytes(StandardCharsets.US_ASCII); 
		String asciiString = Arrays.toString(ascii);
		System.out.println(asciiString);*/
		
		//String to Ascii method :1 
		String s1 = "kesava";
		char[] ch = s1.toCharArray();
		for (char c1 : ch) {
			System.out.print((int) c1+" ");
		}
		System.out.println();
		//Ascii to String
		int num[] = {107, 101, 115, 97, 118,97};
        String str =null;
        for(int i: num){
            str = Character.toString((char)i);
            System.out.print(str+" "); 
            
        }
	}

}

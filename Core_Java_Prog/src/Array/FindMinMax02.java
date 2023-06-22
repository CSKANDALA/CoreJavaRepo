package Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindMinMax02 {
	
	public static void main(String[] args) {
		int minValue = Integer.MAX_VALUE;
		int maxvalue=Integer.MIN_VALUE;
	    Scanner scan = new Scanner(System.in);
	    for (int i = 0; i < 5; i++) {
	        System.out.print("Enter a number as an integer > ");
	       // System.out.flush();
	        int a=scan.nextInt();
	        minValue = Math.min(a, minValue);
	        maxvalue = Math.max(a, maxvalue);
	   }
	    System.out.println("The minimum number is " + minValue);
	    System.out.println("The maxvalue number is " + maxvalue);
	}


}

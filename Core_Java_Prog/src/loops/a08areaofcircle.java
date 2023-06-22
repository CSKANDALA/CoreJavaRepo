package loops;

import java.util.Scanner;

public class a08areaofcircle {
	public static void main(String[] args) {
		int r;
		System.out.println("enter radius value");
		Scanner sc=new Scanner(System.in);
		r=sc.nextInt();
		double p=3.141;
		double a;
		a=p*r*r;
		System.out.println("Area of circle is : "+a);
		
		
	}

}

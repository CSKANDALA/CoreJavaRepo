package generalconcepts;

import java.util.Scanner;

public class Substraction {
	int i;
	int j;
	 void method(){
		System.out.println("Enter i values:");
		Scanner in=new Scanner(System.in);
		i=in.nextInt();
		System.out.println("Enter j values:");
		Scanner in1=new Scanner(System.in);
		j=in1.nextInt();
		System.out.println("sub is:"+(i-j));
			}
	public static void main(String[] args) {
		Substraction sub=new Substraction();
		sub.method();
	}
}

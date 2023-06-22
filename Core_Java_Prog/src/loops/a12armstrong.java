package loops;

import java.util.Scanner;

public class a12armstrong {
	public static void main(String[] args) {
		int n;
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a=n,r=0,s=0;
		while(a!=0){
			r=a%10;
			a=a/10;
			s=s+r*r*r;
		}

		if(n==s){
			System.out.println(n+ " is Aramstrong number");
		}
		else{
			System.out.println(n+ " is not Aramstrong number");
		}
	}
}
//Aramstrong number 407=4*4*4*0*0*0*7*7*7 ==>64+0+343 =407
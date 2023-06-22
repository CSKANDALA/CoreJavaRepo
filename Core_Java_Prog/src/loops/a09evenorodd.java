package loops;

import java.util.Scanner;

public class a09evenorodd {
	public static void main(String[] args) {
		int n;
		System.out.println("enter number");
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		int a=n%2;
		if(a==0){
			System.out.println("even number");
		}
		else{
			System.out.println("odd number");
		}
		
	}

}

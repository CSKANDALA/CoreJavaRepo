package co.in.practice;

/*
1
10
101
1010
10101 
*/
public class t1 {

	public static void main(String[] args) {

		int n = 0;
		for (int i = 1; i <= 5; i++) {
			n = 1;
			for (int j = 1; j <= i; j++) {
				
				System.out.print(n);
				if (n == 1) {
					n = 0;
				}
				else{
					n = 1;
				}

			}
			System.out.println();
		}
	}
}

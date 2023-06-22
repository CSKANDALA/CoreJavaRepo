package primenumber;

public class PrimeNumbersList {
	public static void main(String args[]) {
		// here finding the primeNumers based on i values so : (i%j==0)
		// in case trying to find given number like num=47 then : (num%j==0)
		int num = 50;
		int count;
		int primeNumberCount = 0;
		for (int i = 2; i <= num; i++) {
			count = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0)
					count++;
			}

			if (count == 0) {
				System.out.print(i+" ");
				primeNumberCount++;
			}
		}
		System.out.println();
		System.out.println("prime numbers count : " + primeNumberCount);
	}
}

package co.in.practice;

public class GetPrimeNum {
	int i = 2;
	int count;
	int primeNum=0;

	public int getNum() {

		for (int j = 2; j <= i / 2; j++) {
			count = 0;
			if (i % j == 0) {
				count++;
			}
		}
		if (count == 0) {
			primeNum=i;
			i++;
		}
		return primeNum;
	}

	public static void main(String[] args) {
		GetPrimeNum obj = new GetPrimeNum();
		System.out.println(1 + " , " + obj.getNum());
		System.out.println(2 + " , " + obj.getNum());
		System.out.println(3 + " , " + obj.getNum());
		System.out.println(4 + " , " + obj.getNum());
		System.out.println(5 + " , " + obj.getNum());
		/*for (int i = 1; 1 <= 10; i++) {
			System.out.println(i + " , " + obj.getNum());
		}*/
	}

}

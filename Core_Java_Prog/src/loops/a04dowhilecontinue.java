package loops;

public class a04dowhilecontinue {
	public static void main(String[] args) {
		int a = 10;
		
		do {	
			a++;
			if (a == 15) {
				continue;
			}
			System.out.println("the value of a: " + a);
		} while (a < 20);
		
		/*do {
			if (a == 15) {
				a+=1;
				continue;
			}
			System.out.println("the value of a: " + a);
			a++;
		} while (a < 20);*/
	}
}

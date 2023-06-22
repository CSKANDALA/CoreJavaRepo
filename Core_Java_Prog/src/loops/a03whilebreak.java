package loops;

public class a03whilebreak {
	public static void main(String[] args) {
		int a = 10;
		while (a < 20) {
			System.out.println("the value of a : " + a);
			a++;
			if (a > 15) {
				break;
			}
		}
	}
}

package findoutput;

public class JavaHurngry5 {
	public static void main(String args[]) {
		System.out.println("--->"+javahungrymethod());
	}

	public static int javahungrymethod() {
		try {
			System.out.println("try");
			return 10;
		} catch (Exception e) {
			System.out.println("catch");
		} finally {
			System.out.println("finally");
			return 88;
		}
	}

}

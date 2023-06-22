package findoutput;

public class JavaHurngry3 {
	public static void main(String args[]) {
		System.out.println("main : "+javahungrymethod());
	}

	public static int javahungrymethod() {
		//int y = 4 / 0;
		try {
			System.out.println("try");
			int x = 4 / 0;
			System.out.println("try-->");
			return 10;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("catch");
		} finally {
			System.out.println("finally");
			return 88;
		}
	}
}

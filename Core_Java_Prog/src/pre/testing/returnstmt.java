package pre.testing;

public class returnstmt {

	public void test(String msg) {
		String a = "aaaa";
		try {
			// a=msg;
			throw new Exception();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("aaaaaa");
	}

	public static void main(String[] args) {

		new returnstmt().test("kk");
		System.out.println("------->");
	}
}

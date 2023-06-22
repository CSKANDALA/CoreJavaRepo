package General;

public class Static_use {

	public static int a;
	//public int a;

	public void test() {
		System.out.println("--->a : " + a);
		a++;
		System.out.println("===>a : " + a);
	}

	public static void main(String[] args) {
		
		Static_use obj = new Static_use();
		Static_use obj1 = new Static_use();
		Static_use obj2 = new Static_use();
		obj.test();
		obj1.test();
		obj2.test();
	}
}

package hashcode;

public class ArrayHashcode2 {
	
	static void assign(int[] a) {

		int[] b = new int[5];
		a = b;
		System.out.println("asgn : a hashcode : " + a.hashCode() + ", " + "b hashcode : " + b.hashCode());
	}

	public static void main(String[] args) {
		int[] a = new int[10];
		assign(a);
		System.out.println("main : a hashcode : " + a.hashCode());
	}
}

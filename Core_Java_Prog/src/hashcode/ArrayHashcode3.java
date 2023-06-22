package hashcode;

public class ArrayHashcode3 {
	
	static void assign(int[] a) {

		int[] b = new int[5];
		a = b;
		a[1] = 3;
		System.out.println("asgn : a hashcode : " + a.hashCode() + ", " + "b hashcode : " + b.hashCode());
		System.out.println("asgn : length a : " + a.length + ", length b : " + b.length + " , value : " + a[1]);
	}

	public static void main(String[] args) {
		int[] a = new int[10];
		assign(a);
		System.out.println("main : a hashcode : " + a.hashCode());
		System.out.println("main : length a : " + a.length + " , value : " + a[1]);

	}
}

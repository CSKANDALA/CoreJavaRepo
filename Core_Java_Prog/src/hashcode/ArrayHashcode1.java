package hashcode;

public class ArrayHashcode1 {

	static void assign(int[] a) {
		a[1] = 5;
		System.out.println("asgn : length : " + a.length + " , value : " + a[1]+", hashCode : "+a.hashCode());
	}

	public static void main(String[] args) {
		int[] a = new int[10];
		assign(a);
		System.out.println("main : length : " + a.length + " , value : " + a[1]+", hashCode : "+a.hashCode());
	}
}

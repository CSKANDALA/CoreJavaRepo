package String;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String s = "my name   kesava";
		System.out.println("s0--->" + s);
		String s1 = s.replace(" ", "");
		System.out.println("s1--->" + s1);
		String s2 = s.replaceAll("\\s", "");
		System.out.println("s3--->" + s2);
	}
}

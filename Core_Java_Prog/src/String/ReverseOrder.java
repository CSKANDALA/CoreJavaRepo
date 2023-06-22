package String;

public class ReverseOrder {

	public static void main(String[] args) {
		
		String s1 = "kesava,chandra,a,b,c";
		String[] s2 = s1.split(",");
		for (int i = s2.length - 1; i >= 0; i--) {
			System.out.println("--->" + s2[i]);
		}
	}
}

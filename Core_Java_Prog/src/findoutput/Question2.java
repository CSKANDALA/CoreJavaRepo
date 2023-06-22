package findoutput;

public class Question2 {
	
	public static void JavaHungry(Object s) {
		System.out.println("Object");
	}

	public static void JavaHungry(String o) {
		System.out.println("String");
	}

	public static void main(String args[]) {
		JavaHungry(null);
	}
}

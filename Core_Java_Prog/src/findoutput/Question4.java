package findoutput;

public class Question4 {
	//may be it will call child class
	public static void JavaHungry(Exception e) {
		System.out.println("Exception");
	}

	public static void JavaHungry(ArithmeticException a) {
		System.out.println("ArithmeticException");
	}

	/*public static void JavaHungry(NullPointerException a) {
		System.out.println("ArithmeticException");
	}*/
	
	public static void JavaHungry(Object o) {
		System.out.println("0bject");
	}

	public static void main(String args[]) {
		JavaHungry(null);
	}

}

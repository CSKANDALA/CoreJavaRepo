package findoutput;

public class Question1 {
	//i think proyarity first will give Integer / String and then Object
	public static void JavaHungry(String s) {
		System.out.println("String");
	}

	/*public static void JavaHungry(Object o) {
		System.out.println("Object");
	}*/

	public static void JavaHungry(Integer s) {
		System.out.println("Integer");
	}

	public static void main(String args[]) {
		JavaHungry(null);
		 //JavaHungry("10");
		 //JavaHungry(10);
	}
}

// out
// Compile : No , Error at line 23
// Reason : Method is ambiguous
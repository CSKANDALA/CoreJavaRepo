package String;

public class StringProperties {
	String nameStr = "Arvind";
	String nameStr1 = "arvind";
	String test = new String();

	void method1() {
		System.out.println("equals of string:" + nameStr.equals(nameStr1));
	}

	void method2() {
		System.out.println("ignore of string:" + nameStr.equalsIgnoreCase(nameStr1));
	}

	void method3() {
		System.out.println("length of string:" + nameStr.length());
	}

	void method4() {
		System.out.println("char of string:" + nameStr.charAt(2));
	}

	void method5() {
		System.out.println("compare of string:" + nameStr.compareTo(nameStr1));
	}

	void method6() {
		System.out.println("Uppercase of string:" + nameStr.toUpperCase());
	}

	void method7() {
		System.out.println("Lowercase of string:" + nameStr.toLowerCase());
	}

	void method8() {
		System.out.println("matches of string:" + nameStr.matches(nameStr1));
	}

	void method9() {
		nameStr.endsWith(nameStr1);
		System.out.println("end of string:" + nameStr.endsWith(nameStr1));
	}

	void method10() {
		nameStr.isEmpty();
		System.out.println("empty of string:" + nameStr.endsWith(nameStr1));
	}

	public static void main(String args[]) {

		StringProperties test1 = new StringProperties();
		test1.method1();
		test1.method2();
		test1.method3();
		test1.method4();
		test1.method5();
		test1.method6();
		test1.method7();
		test1.method8();
		test1.method9();
		test1.method10();
	}

}

package Interview;

//in parent class if you use static, final, private means not possible to override
public abstract class Parent {
	public int i = 10;

	public void concreatMehod1() {
		System.out.println("parent concreat Mehod1 is calling");
	}

	public void concreatMehod2() {
		System.out.println("parent concreat Mehod2-3 is calling");
	}

	public static void staticMethod() {
		System.out.println("parent static method is calling");
	}

	private void privateMethod() {
		System.out.println("parent private Method is calling");
	}

	public final void finalMethod() {
		System.out.println("parent final Method is calling");
	}

	/*public abstract static void staticMethod2();
	private abstract void privateMethod2();
	public final abstract  void finalMethod2();*/

	public static void main(String[] args) {
		
		 //Parent obj2= new Parent();
	}
}

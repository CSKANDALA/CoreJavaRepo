package Interview;

public class Child extends Parent {

	public int i = 20;

	/*Observation points(Inheritance/Abstraction)
	 * 1)parent class contain private, static, final methods
	 * 2)in child class we can able to create private, static methods without @Override
	 * 3)we can't create final method in child class
	 * 4) parent p=new child(); using this object we can call methods in child which are having @Override
	 * 5)child c=new child(); using this object we will call all methods in child, in case method not available in 
	 *   child class, call parent class.
	 */
	
	@Override
	public void concreatMehod1() {
		System.out.println("child concreat Mehod1 is calling");
	}

	/*@Override
	private void concreatMehod2() {
	System.out.println("child concreat Mehod2 is calling"); }*/
	 

	// parent and child have same method with static keyword means overriding is
	// not happens
	// @Override
	public static void staticMethod() {
		System.out.println("child static method is calling");
	}

	// @Override
	private void privateMethod() {
		System.out.println("child private Method is calling");
	}

	// @Override
	
	 /*public final void finalMethod() {
	 System.out.println("child final Method is calling"); }*/
	 

	public static void main(String[] args) {

		//@Override child class methods only will call, else parent class methods will call
		Parent obj1 = new Child();
		System.out.println("case 1 : " + obj1.i);
		obj1.concreatMehod1();
		obj1.concreatMehod2();
		obj1.staticMethod();
		obj1.finalMethod();
		System.out.println();
		// Child obj2 = new Parent(); throws error
		// Parent obj2= new Parent();

		/*Child obj3 = new Child();
		System.out.println("case 2 : " + obj3.i);
		obj3.concreatMehod1();
		obj3.concreatMehod2();
		obj3.privateMethod();
		obj3.staticMethod();*/
	}
}

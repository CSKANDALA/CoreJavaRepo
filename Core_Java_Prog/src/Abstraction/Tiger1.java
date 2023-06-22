package Abstraction;

public class Tiger1 extends Animal1 {

	void speed() {
		System.out.println(" Tiger >>> Speed ");
	}

	void eat() {
		System.out.println(" Tiger >>> Eat ");
	}

	void tigerFun() {
		System.out.println("Tiger Function");
	}

	public static void main(String arg[]) {

		Tiger1 tiger = new Tiger1();
		tiger.breath();
		tiger.speed();
		tiger.tigerFun();

	}
}

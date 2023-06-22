package Abstraction;

public class Dog1 extends Animal1 {

	void eat() {
		System.out.println(" Dog >>> Eat method");
	}

	void speed() {
		System.out.println(" Dog >>> Speed ");
	}

	void dogFun() {
		System.out.println(" Dog Function ");
	}

	public static void main(String arg[]) {

		Dog1 d = new Dog1();
		d.breath();
		d.eat();
		d.speed();

	}

}

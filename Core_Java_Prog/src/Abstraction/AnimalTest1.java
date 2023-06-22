package Abstraction;

public class AnimalTest1 {
	/*
	 * void callFun(Dog1 d){
	 * 
	 * d.dogFun(); } void callFun(Tiger1 t){
	 * 
	 * t.tigerFun(); }
	 */

	void callFun(Animal1 ani) {

		ani.eat();
		ani.breath();
		ani.speed();

		if (ani instanceof Dog1) {
			((Dog1) ani).dogFun();

		} else if (ani instanceof Tiger1) {
			((Tiger1) ani).tigerFun();
		}

	}

	public static void main(String arg[]) {

		AnimalTest1 atest = new AnimalTest1();

		Dog1 dog = new Dog1();
		Tiger1 tiger = new Tiger1();

		atest.callFun(dog);
		atest.callFun(tiger);

		/*
		 * dog.eat(); dog.dogFun(); tiger.eat(); tiger.tigerFun();
		 */
	}
}

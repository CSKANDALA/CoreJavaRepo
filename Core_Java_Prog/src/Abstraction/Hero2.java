package Abstraction;

public class Hero2 extends Bike2{
void capacity(){
		
		System.out.println("capacity is : 100 kg");
		
	}

	void mileage(){
			
			System.out.println("mileage is : 50km/l ");
	}

	void heroFun(){
		
		System.out.println(" Hero Function ");
	}
	
	public static void main(String arg[]){
		
		Hero2 h= new Hero2();
		h.wheels();
		h.capacity();
		h.mileage();
		
	}
}

package Abstraction;

public class Bajaj2 extends Bike2{
void capacity(){
		
		System.out.println(" capacity is : 150 kg");
		
	}

	void mileage(){
			
			System.out.println(" mileage is : 40km/l ");
	}

	void bajajFun(){
		
		System.out.println(" Bajaj Function ");
	}
	
	public static void main(String arg[]){
		
		Bajaj2 b= new Bajaj2();
		b.wheels();
		b.capacity();
		b.mileage();
		
	}
}

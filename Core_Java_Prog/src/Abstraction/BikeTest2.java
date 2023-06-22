package Abstraction;

public class BikeTest2 {
void callFun(Hero2 h){
		
		h.heroFun();
	}
	void callFun(Bajaj2 b){
		
		b.bajajFun();
	}

	void callFun(Bike2 bi){
		
		bi.capacity();
		bi.wheels();
		bi.mileage();
		
		if(bi instanceof Hero2){
			((Hero2)bi).heroFun();
			
		}else if(bi instanceof Bajaj2){
			((Bajaj2)bi).bajajFun();
		}
		
	}
	

	public static void main(String arg[]){
		
		BikeTest2 btest= new BikeTest2();
		
		Hero2 hero = new Hero2();
		Bajaj2 bajaj= new Bajaj2();
		
		btest.callFun(hero);
		btest.callFun(bajaj);
			

		
		/*hero.capacity();
		hero.heroFun();
		bajaj.capacity();
		bajaj.bajajFun();*/
		
	}
}

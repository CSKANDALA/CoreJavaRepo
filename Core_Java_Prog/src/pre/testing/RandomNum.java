package pre.testing;

import java.util.Random;

public class RandomNum {
public static void main(String[] args) {
	final int min=20;
	final int max=25;
	//int a=();
	final int numberOfRandom = 10;
	Random temperature = new Random();
	Random humidity = new Random();
	float temperatureValue=(float) ((temperature.nextInt(max) + min)+(temperature.nextInt(max)+min) / 10.0);
	float humidityValue=(humidity.nextInt(max) + min);
	System.out.println("------->"+temperatureValue);
	System.out.println("=======>"+((temperature.nextInt(max) + min)/100));
	
	Random r = new Random();
	double random = (r.nextInt(max)+min) / 10.0;
	System.out.println("AAAAAA : "+random);
}
}

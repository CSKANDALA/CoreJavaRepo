package pre.testing;

import java.util.Map;

public class ThreadRun implements Runnable {
	ThreadRun(){
		 run();
	}

	@Override
	public void run() {
		System.out.println("---------------------------------------------------");

		while (true) {

			System.out.println("========================================================");
		}
	}
	public static void main(String[] args) {
		new ThreadRun();
	}
}

package pre.testing;

import java.util.TimerTask;
import java.util.Date;
import java.util.Timer;

public class Timer_EX1 extends TimerTask {

	@Override
	public void run() {
		System.out.println("Run Me ~  " +new Date());
	}

	public static void main(String[] args) {

		TimerTask task = new Timer_EX1();

		Timer timer = new Timer();
		timer.schedule(task, 1000, 20000);

	}
}

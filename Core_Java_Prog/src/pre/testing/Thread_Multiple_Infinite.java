package pre.testing;

/**
 * two threads will create, this will not terminate
 * print thread id's continuously, this threads will not terminate
 *
 */
public class Thread_Multiple_Infinite implements Runnable {

	public void run() {
		while (true) {
			System.out.println(Thread.currentThread().getId());
		}
	}

	public static void main(String args[]) {
		Thread_Multiple_Infinite sample = new Thread_Multiple_Infinite();
		Thread t1 = new Thread(sample);
		Thread t2 = new Thread(sample);
		t1.start();
		t2.start();
	}
}

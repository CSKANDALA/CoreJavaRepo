package pre.testing;

/**
 * print thread id continuously, this thread will not terminate
 *
 */
public class Thread_Single_Infinite implements Runnable {

	public void run() {
		while (true) {
			System.out.println(Thread.currentThread().getId());
		}
	}

	public static void main(String args[]) {
		Thread_Single_Infinite sample = new Thread_Single_Infinite();
		Thread t1 = new Thread(sample);
		t1.start();
	}
}

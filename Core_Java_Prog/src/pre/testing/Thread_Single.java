package pre.testing;

/**
 * print thread id once and that thread will close
 *
 */
public class Thread_Single implements Runnable {

	public void run() {
		System.out.println(Thread.currentThread().getId());
	}

	public static void main(String args[]) {
		Thread_Single sample = new Thread_Single();
		Thread t1 = new Thread(sample);
		t1.start();
	}
}

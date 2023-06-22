package pre.testing;

/**
 * print first thread id and that thread will close and second thread starts, do
 * same as first thread
 *
 */
public class Thread_Multiple implements Runnable {

	public void run() {
		System.out.println(Thread.currentThread().getId());
	}

	public static void main(String args[]) {
		
        // method : 1
		
		/*int i = 1;
		while (i < 3) {
			Thread_Multiple sample = new Thread_Multiple();
			Thread t1 = new Thread(sample);
			t1.start();
			i++;
		}*/

		 // method : 2
		
		Thread_Multiple sample = new Thread_Multiple();
		Thread t1 = new Thread(sample);
		Thread t2 = new Thread(sample);
		t1.start();
		t2.start();
	}
}

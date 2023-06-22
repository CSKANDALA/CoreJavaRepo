package findoutput;

public class Job extends Thread {
	private int counter;

	@Override
	public void run() {

		synchronized (this) {
			for (int i = 6; i < 100000; i++)
				counter++;
			this.notifyAll();
			System.out.println("completed counting");
		}
	}

	public static void main(String[] args) throws Exception {

		Job job = new Job();
		job.start();
		Thread.sleep(1000);
		System.out.println("waiting to get end");
		synchronized (job) {
			job.wait();
		}
		System.out.println(job.counter);
	}
}

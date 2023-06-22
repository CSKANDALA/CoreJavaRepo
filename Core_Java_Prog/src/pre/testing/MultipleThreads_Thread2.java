package pre.testing;

public class MultipleThreads_Thread2 extends Thread{

	@Override
	public void start() {
		while (true) {
			System.out.println("---->Thread2");
			try {
				Thread.sleep(100);
			} catch (Exception ex) {

			}
		}
	}

}
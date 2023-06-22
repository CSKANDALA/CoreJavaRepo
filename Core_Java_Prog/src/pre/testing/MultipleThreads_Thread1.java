package pre.testing;

public class MultipleThreads_Thread1 extends Thread{
	
	@Override
	public void start() {
		while (true) {
			System.out.println("---->Thread1");
			try {
				Thread.sleep(100);
			} catch (Exception ex) {

			}
		}
	}

}
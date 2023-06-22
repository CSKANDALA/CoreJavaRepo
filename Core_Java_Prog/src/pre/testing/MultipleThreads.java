package pre.testing;

public class MultipleThreads {
	/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	MultipleThreads_Thread1 thread1 = new MultipleThreads_Thread1();
    	MultipleThreads_Thread2 thread2 = new MultipleThreads_Thread2();
    	thread1.start();
    	thread2.start();
    }
}

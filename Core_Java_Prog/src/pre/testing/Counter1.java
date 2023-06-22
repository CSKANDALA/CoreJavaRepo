package pre.testing;

import java.util.concurrent.locks.Lock;

public class Counter1 {
	
	private Lock lock =null;
	  private int count = 0;

	  public int inc(){
	    lock.lock();
	    int newCount = ++count;
	    lock.unlock();
	    return newCount;
	  }
	  public static void main(String[] args) {
	  Counter con=new Counter();
		int s=con.inc();
		System.out.println("----------> "+s);
}
}

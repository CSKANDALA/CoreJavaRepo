package pre.testing;

public class Counter {

	private int count = 0;

	  public int inc(){
	   // synchronized(this){
	      return ++count;
	   // }
	  }

public static void main(String[] args) {
	
	Counter con=new Counter();
	int s=con.inc();
	System.out.println("----------> "+s);
	
}
}

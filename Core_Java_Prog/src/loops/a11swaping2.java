package loops;

public class a11swaping2 {

	public static void main(String[] args) {
	
         int x=10,y=20;
         System.out.println("before swapping : x= "+x+ "and y= "+y);
         x=x+y;
         y=x-y;
         x=x-y;
         System.out.println("after swapping  : x= "+x+" and y="+y);
	}
}

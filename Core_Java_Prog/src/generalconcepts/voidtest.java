package generalconcepts;

public class voidtest {
	
	public void method1(){
		int a=10;
		System.out.println("test 1 : "+a);
	}
	public int method2(){
		int a=20;
		int b=40;
		int c;
		c=(a+b);
		return c;
	}
	public static void main(String[] args) {
	    voidtest t=new voidtest();
		t.method1();
		//System.out.println(t.method1());
		int b=t.method2();
		System.out.println("test 2 : "+b);
	}
}

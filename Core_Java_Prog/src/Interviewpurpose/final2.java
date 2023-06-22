package Interviewpurpose;

public class final2 {
	int f1 = 10;
	final int f2 = 10;

	public static void main(String args[]) {
		final final2 t1 = new final2();
		final2 t2 = new final2();
		t2=t1;
		//t1 = t2;
		System.out.println(t1.f1+", "+t2.f1);
		t2.f1=20;
		//t2.f2=30;
		System.out.println(t1.f1+", "+t2.f1);
	}

}

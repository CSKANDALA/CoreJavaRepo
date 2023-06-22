package pre.testing;

public class SimpleObject {

	int i =0;

	public int getI() {
		return i & 255;
	}

	public void setI(int i) {
		this.i = i;
	}
	
	public static void main(String[] args) {
		SimpleObject obj=new SimpleObject();
		obj.setI(2000);
		System.out.println("------>"+obj.getI());
	}
}

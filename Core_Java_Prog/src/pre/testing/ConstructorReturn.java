package pre.testing;

public class ConstructorReturn {

	/*ConstructorReturn(){
		ConstructorReturn(1);
	}*/
	
	Integer ConstructorReturn(int i) {
		System.out.println("test....");
		return 100;

	}

	public static void main(String[] args) {
		ConstructorReturn obj = new ConstructorReturn();
		System.out.println("----->" + obj.ConstructorReturn(10));
	}

}

package javaconcepts;

public class FinalizeDemo {

	public void finalize() {
		System.out.println("finalize called");
	}

	public static void main(String[] args) {
		FinalizeDemo f1 = new FinalizeDemo();
		// f1.finalize();
		FinalizeDemo f2 = new FinalizeDemo();
		f1 = null;
		f2 = null;
		System.gc();
	}
}

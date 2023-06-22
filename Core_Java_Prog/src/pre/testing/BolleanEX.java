package pre.testing;

public class BolleanEX {
	int enableValue = 255;
	int newValue = 0;

	public void setBit(int b) {
		b = b & 255;
		int newValue = this.enableValue | b;
		boolean changed = newValue != enableValue;
		enableValue = newValue;
		System.out.println("---->" + changed);
	}

	public void resetBit(int value) {
		setBit(~value);
	}

	public static void main(String[] args) {
		BolleanEX obj = new BolleanEX();
		obj.setBit(0);
		// obj.resetBit(1);

	}
}

package pre.testing;

public class StringToByteArray {
	public void convertStringToByteArray() {

		String stringToConvert = "{\"request\":\"addSchedule\",\"time\":1483209000000,\"thingId\":\"Bajaj/Aircooler/PX103PC/001\",\"description\":\"\",\"hour\":0,\"minute\":0,\"repeat\":0,\"action\":true,\"active\":true}";
		byte[] theByteArray = stringToConvert.getBytes();
		System.out.println(theByteArray);
		String s = new String(theByteArray);
		System.out.println("Text Decryted : " + s);
	}

	public static void main(String[] args) {
		new StringToByteArray().convertStringToByteArray();
	}
}

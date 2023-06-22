package pre.testing;

public class ForLoop {
	protected static String[] splittedMessage = null;

	public static void main(String[] args) {

		String s1 = "1,10,2,20,3,30";
		splittedMessage = s1.split(",");
		
		for (int i = 0; i < splittedMessage.length; i+=2) {
			String updatethingconfig = "72," + splittedMessage[i] + "," + splittedMessage[i + 1];
			System.out.println("---------->" + updatethingconfig);
		}
	}
}

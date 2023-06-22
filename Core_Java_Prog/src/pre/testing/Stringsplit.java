package pre.testing;

import java.util.Arrays;

public class Stringsplit {
	
public static void main(String[] args) {

	String str= "Bajaj|Air cooler|HC001|33";
	
	String[] manufactureUIdparts=str.split("\\|");
	
	String manufacturer = manufactureUIdparts[0];
	String product = manufactureUIdparts[1];
	String model = manufactureUIdparts[2];
	String serialNumber = manufactureUIdparts[3];
	System.out.println(manufacturer+" "+product+" "+manufactureUIdparts);
	
	
	
	/*String wordsWithNumbers = "Bajaj|Air|cooler";
    String[] manufactureUIdparts = wordsWithNumbers.split("\\|");
    String manufacturer = manufactureUIdparts[0];
    String product = manufactureUIdparts[1];

	System.out.println(manufacturer+" "+product+" "+manufactureUIdparts);*/
}
}

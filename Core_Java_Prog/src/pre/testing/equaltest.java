package pre.testing;
public class equaltest {
public static void main(String[] args) {
	String s="ManufactureUId [manufacturer=Bajaj, product=Air cooler, model=HC01, serialNumber=1234]";
	String t="ManufactureUId [manufacturer=Bajaj, product=Air cooler, model=HC01, serialNumber=1234]";
	
	if(s==t){
		System.out.println("equal");
	}else{
		System.out.println("no");
	}
}
}

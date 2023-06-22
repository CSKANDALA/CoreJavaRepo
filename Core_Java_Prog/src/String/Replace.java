package String;

public class Replace {
	
	public static void main(String[] args ){
		
		String s="Hellow kesava Hellow kesava";
		
		System.out.println(s.replace('H', 'W'));
		System.out.println(s.replaceAll("He", "Wo"));
		System.out.println(s.replaceFirst("He", "Wo"));
	}

}

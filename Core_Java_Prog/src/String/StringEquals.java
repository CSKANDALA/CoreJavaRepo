package String;

public class StringEquals {

	/*
	 * We can use == operators for reference comparison (address comparison) and .equals() method for content comparison
	 */
	public static void main(String[] args) {
		
		String s1="abc";
		String s2="abc";
		System.out.println("--->1 : "+s1==s2);
		System.out.println("===>2 : "+s1.equals(s2));
		
		String s3=new String("abc");
		String s4=new String("abc");
		System.out.println("--->3 : "+s3==s4);
		System.out.println("===>4 : "+s3.equals(s4));
		
		String s5="abc";
		String s6=new String("abc");
		System.out.println("--->5 : "+s5==s6);
		System.out.println("===>6 : "+s5.equals(s6));
	}
}

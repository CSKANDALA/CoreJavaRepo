package String;

public class pattern1 {
	public static void main(String args[]) 
	{
		String str="my name is kesava ka ke ku kl";
        String s[ ]=str.split(" ");
             for(int i=0;i<s.length;i+=3)
			    System.out.print(s[i]+" ");
		}
}

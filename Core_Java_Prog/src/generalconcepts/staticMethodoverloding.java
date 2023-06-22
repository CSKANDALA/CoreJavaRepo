package generalconcepts;

public class staticMethodoverloding {
	
	public static void sum(int a)
	{
		System.out.println(a);
	}
	public static void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void sum(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}

	public static void main(String[] args)
	{
		staticMethodoverloding.sum(1);
		staticMethodoverloding.sum(1, 2);
		staticMethodoverloding.sum(1, 2, 3);
	}
}

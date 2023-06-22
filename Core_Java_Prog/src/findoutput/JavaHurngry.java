package findoutput;

public class JavaHurngry {
	public static void main (String args []){
	 short s = 0;
	 int x = 07;
	 int y = 08;
	 int z = 123455;
	 
	 s += z;
	 System.out.println("" + x + y + s);
	 }
}

//OUT
//Compile :  No ,  Error at line 7
//Reason  :   Any  number starting with 0  is  an octal number 
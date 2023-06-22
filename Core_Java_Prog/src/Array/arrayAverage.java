package Array;

public class arrayAverage {
	public static void main(String args[]) {  
        
		  double nums[] = {10.1, 11.2, 12.3, 13.4, 14.5};// Here We Define Array   
		  double result = 0; // Result variable to Store the sum of array of values  
		  int i;  
		  
		  for(i=0; i<nums.length; i++)  
		   result += nums[i]; //addition of Values  
		  System.out.println("Average is " + result / nums.length);  
		 }  
          
}

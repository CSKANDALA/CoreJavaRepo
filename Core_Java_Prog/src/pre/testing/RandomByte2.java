package pre.testing;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class RandomByte2 {

 public static void main(String[] args) {
  System.out.println(Arrays.toString(getRandomByteArray(1)));
  
  //SecureRandom is a  bit costlier object. 
  SecureRandom random= new SecureRandom();
  System.out.println(Arrays.toString(random.generateSeed(256)));
  
 }
 public static byte[] getRandomByteArray(int size){
  byte[] result= new byte[size];
  Random random= new Random();
  random.nextBytes(result);
  return result;
 }
}

package pre.testing;
import java.util.ArrayList;
public class Rotation{
  // Demonstrate rotat(a,shift) method
  public static void main(String arg[]){
    ArrayList<Character> charsL;
    charsL = new ArrayList<Character>();
    char [] chars = { 'A', 'B', 'C',
                      'D', 'E', 'F'};
    for(char c : chars){
      charsL.add(c);
    }
    // charsL = [ A, B, C, D, E, F]

    ArrayList<Character> result1;

    result1 = rotate(charsL, 2);
    // result1== [ E, F, A, B, C, D]
    System.out.println(result1);

   /* result1 = rotate(charsL, 7);
    // result1== [ F, A, B, C, D, E]
    System.out.println(result1);*/

    // WORKS WITH SRTINGS TOO
    ArrayList<String> stringL;
    stringL = new ArrayList<String>();
    String [] strs = { "A", "B", "C",
                       "D", "E", "F", "G" };
    for(String s : strs){
      stringL.add(s);
    }
    // stringL = [ A, B, C, D, E, F, G]

    ArrayList<String> result2;

    /*result2 = rotate(stringL, 7);
    // result2== [ A, B, C, D, E, F, G]
    System.out.println(result2);*/

    result2 = rotate(stringL, 4);
    // result2== [ D, E, F, G, A, B, C]
    System.out.println(result2);
  }

  public static <T>
  ArrayList<T> rotate(ArrayList<T> aL, int shift){
    // YOUR DEFINITION HERE 

      ArrayList <T> newValues = new ArrayList<>();
      ArrayList <T> temp = new ArrayList<>();

      for(int i = 0; i < aL.size(); i++)
      {
          newValues.remove(aL.get(shift));
          newValues.add(aL.get(i));
         //newValues.add(shift, aL.get(i));

      }
      return newValues;

  }

}
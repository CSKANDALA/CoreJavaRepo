package String;

import java.util.*;

public class WordCount {
	
	private String[] splitter;
    private int[] counter;
     public void countWords(String text){
         
        // remove any '\n' characters that may occur
    	 System.out.println("test1 : "+text);
        String temp = text.replaceAll("[\\n]", " ");
        System.out.println("test2 : "+text);
        // replace any grammatical characters and split the String into an array
        splitter = temp.replaceAll("[.,?!:;/]", "").split(" ");
 
        // intialize an int array to hold count of each word
        counter= new int[splitter.length];
 
        // loop through the sentence
        for(int i =0; i< splitter.length; i++){
 
            // hold current word in the sentence in temp variable
            temp = splitter[i];
 
                // inner loop to compare current word with those in the sentence
                // incrementing the counter of the adjacent int array for each match
                for (int k=0; k< splitter.length; k++){
 
                    if(temp.equalsIgnoreCase(splitter[k]))
                    {
                        counter[k]++;
                    }
                }
        }
 
        printResults();
    }
 
 
    private void printResults()
    {
 
      // create a HashMap to store unique combination of words and their counter
      // the word being the key and the number of occurences is the value
      HashMap map = new HashMap();
 
      // populate the map
      for (int i=0; i< splitter.length; i++)
      {
          map.put(splitter[i].toLowerCase(), counter[i]);
      }
 
      // create an iterator on the map keys
      Iterator it = map.keySet().iterator();
 
        System.out.println("Word             Count");
        System.out.println("-----------------------");
 
        // loop for each key
        while(it.hasNext())
        {
            String temp =(String)it.next();
 
            // print the word itself
            System.out.print(temp);
 
             // add relevant spacing to print consistently
            for (int i=0;i< (20 - temp.length());i++)
            {
                System.out.print(" ");
            }
 
            // print the value (i.e. count of each word)
            System.out.println(map.get(temp.toString()));
        }
    }
 
 
 
    // main method to test the class
    public static void main(String[] args){
     String sentence="Chennai Nellore Chennai Hydhrabad Nellore nellore "+
                     "kesava chandra kesava";
     WordCount wc = new WordCount();
     wc.countWords(sentence);
 
    }

}

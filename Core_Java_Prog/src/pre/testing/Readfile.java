package pre.testing;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Readfile {

		public static void main(String args[]){
    try {
    	BufferedReader br = new BufferedReader(new FileReader("D:/kesava/MessageFile-01.txt"));
        try {
            String x;
            while ( (x = br.readLine()) != null ) {
                // printing out each line in the file
            	//WebSocketEvent s = TestWebSocketEventFactory.getinstance().getEventfromstring(x);
                System.out.println(x);
 
            } 
        } catch (IOException e) {
            e.printStackTrace();
        }
    } catch (FileNotFoundException e) {
        System.out.println(e);
        e.printStackTrace();
    }

}}

package pre.testing;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;

public class consoltext_infile {

	public static void main(String[] args) {
		try {
			// create a buffered reader that connects to the console, we use it
			// so we can read lines
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("aaaaaaaaaaaaaaaaaa");
			System.out.println("bbbbbbbbbbbbbbbbbb");
			// read a line from the console
			String lineFromInput = in.readLine();

			// create an print writer for writing to a file
			/*PrintWriter out = new PrintWriter(new FileWriter("D:/kesava/java_file_writing.txt"));

			// output to the file a line
			out.println(out);
			System.setOut(out);*/
			 PrintWriter outputfile = new PrintWriter("D:/kesava/java_file_writing.txt");
			//replace your System.out.print("your output");
			    outputfile.print("your output");
			PrintStream out = new PrintStream(new FileOutputStream("D:/kesava/java_file_writing.txt"));
			System.setOut(out);
			// close the file (VERY IMPORTANT!)
			out.close();
		} catch (IOException e1) {
			System.out.println("Error during reading/writing");
		}
	}
}

package pre.testing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class test2 {
public static void main(String[] args) throws FileNotFoundException {
	File file = new File("D:/kesava/java_file_writing.txt"); //Your file
	FileOutputStream fos = new FileOutputStream(file);
	PrintStream ps = new PrintStream(fos);
	System.setOut(ps);
	System.out.println("This zz goes to out.txt");
}
}

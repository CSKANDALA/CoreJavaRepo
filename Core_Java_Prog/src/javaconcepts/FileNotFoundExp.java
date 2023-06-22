package javaconcepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFoundExp {
	
	public void filePathCheck() {
		FileInputStream d = null;
		try {
			d = new FileInputStream("C:\\text\\a.tx");
		} catch (FileNotFoundException e) {
			System.out.println("The source file does not exist. " + e);
		}
	}

	public static void main(String args[]) {
		FileNotFoundExp e = new FileNotFoundExp();
		e.filePathCheck();
	}
}

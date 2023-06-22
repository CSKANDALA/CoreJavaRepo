package pre.testing;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ListOfFiles {

	public static void main(String[] args) {

		List<String> results = new ArrayList<String>();
		File[] files = new File("D:\\\\kesava\\\\test").listFiles();
		// If this pathname does not denote a directory, then listFiles() returns null.

		for (File file : files) {
			if (file.isFile()) {
				System.out.println("---List of files : " + file.getName());
				results.add(file.getName());
			}
		}
		// System.out.println("---List of files : "+files);
	}
}
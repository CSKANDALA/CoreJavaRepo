package pre.testing;

import java.io.File;
import java.io.FileFilter;

import org.apache.commons.io.filefilter.WildcardFileFilter;

public class MatchingFiles {

	public static void main(String[] args) {
		File dir = new File("D:\\kesava\\test");
		FileFilter fileFilter = new WildcardFileFilter("pivot_azure_UpdateValue_2017-11*.avro");
		File[] files = dir.listFiles(fileFilter);
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i]);
		}
	}

}

package File;

import java.io.File;

public class DemoGetAllFile {
	public static void main(String[] args) {
		File f = new File("C://");
		getFileDirectory(f);
	}
	
	private static void getFileDirectory(File f) {
		if (f.isFile()) {
			System.out.println(f.getAbsolutePath());
			return;
		}
		File[] listFile = f.listFiles();
		if (listFile == null)
			return;
		for (File t : listFile) {
			getFileDirectory(t);
		}
	}
}

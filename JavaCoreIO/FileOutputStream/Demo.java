package FileOutputStream;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Demo {
	public static void main(String[] args) throws IOException {
		//Write file with FileOutputStream
		FileOutputStream fos = null;
		String s = "Hello World";
		byte[] bytes = s.getBytes();
		try {
			fos = new FileOutputStream("JavaCoreIO//FileOutputStream//DataFileOutputStream");
			fos.write(bytes);
			fos.close();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			fos.close();
		}
		
		//Write file with FileWriter
		FileWriter fw = new FileWriter("JavaCoreIO//FileOutputStream//DataFileWriter");
		fw.write("Hello FileWriter in Java");
		fw.close();
	}
}

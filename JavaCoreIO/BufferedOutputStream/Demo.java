package BufferedOutputStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream("JavaCoreIO//BufferedOutputStream//Data");
			bos = new BufferedOutputStream(fos);
			String s = "Hello World!";
			byte[] bytes = s.getBytes();
			bos.write(bytes);
			bos.flush();
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			bos.close();
			fos.close();
		}
	}
}

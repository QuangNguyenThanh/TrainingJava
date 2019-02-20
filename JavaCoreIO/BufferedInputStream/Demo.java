package BufferedInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try {
			fis = new FileInputStream("JavaCoreIO//BufferedInputStream//Data");
			bis = new BufferedInputStream(fis);
			int i;
			while ((i = bis.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			bis.close();
			fis.close();
		}
	}
}

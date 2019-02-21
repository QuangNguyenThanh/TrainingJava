package Exception;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class DemoUnsupportedEncodingException {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = null;
		try {
			String alpha = "Nguyen Thanh Quang";
			fos = new FileOutputStream("JavaCoreIO/Exception/data");
			fos.write(alpha.getBytes("Quang"));
			fos.close();
		} catch (UnsupportedEncodingException e) {
			System.out.println("Error: " + e.getMessage() + " charset is not supported");
		} finally {
			fos.close();
		}
	}
}

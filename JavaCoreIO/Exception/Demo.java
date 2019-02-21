package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Demo {
	public static void main(String[] args) throws IOException {
		//Đoạn code bên dưới xảy ra cả 2 ngoại lệ FileNotFound và UnsupportedEncoding
		//nhưng chỉ bắt được duy nhất 1 catch FileNotFound tại thời điểm runtime
		try {
			File f = new File("JavaCorIO//Quang.txt");
			String alpha = "Nguyen Thanh Quang";
			FileOutputStream fos = new FileOutputStream(f);
			fos.write(alpha.getBytes("Quang"));
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("FileNotFoundException occurred");
		} catch (UnsupportedEncodingException e) {
			System.out.println("UnsupportedEncodingException occurred");
		}
	}
}

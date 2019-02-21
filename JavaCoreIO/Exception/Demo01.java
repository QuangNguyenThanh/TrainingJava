package Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo01 {
	public static void main(String[] args) throws IOException {
		//Đoạn code có 2 catch để bắt lỗi IOException và FileNotFoundException
		//nhưng catch FileNotFound nằm dưới IOException vi phạm quy tắc đặt catch
		//(đặt catch theo thứ tự cụ thể nhất đến chung nhất) nên bị lỗi.
		try {
			File f = new File("JavaCorIO//Quang.txt");
			FileInputStream fis = new FileInputStream(f);
		} catch (IOException e) {
			System.out.println("IOException occurred");
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException occurred");
		}
	}
}

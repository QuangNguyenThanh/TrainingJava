package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoFileNotFoundException {
	public static void main(String[] args) throws IOException {
		try {
			FileInputStream fis = new FileInputStream("JavaCorIO//Quang.txt");
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("FileNotFoundException occurred");
		}
	}
}

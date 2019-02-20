package FileInputStream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Demo {
	public static void main(String[] args) throws IOException {
		//Read File with FileInputStream
		FileInputStream fis = null;
        try {
            fis = new FileInputStream("JavaCoreIO//FileInputStream//Data");
            int i = 0;
            System.out.print("Read File with FileInputStream: ");
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            fis.close();
        }
        System.out.println();
        
        //Read File with FileReader
        FileReader fr = new FileReader("JavaCoreIO//FileInputStream//Data");
        int i;
        System.out.print("Read File with FileReader: ");
        while ((i = fr.read()) != -1) {
        	System.out.print((char) i);
        }
        fr.close();
	}
}

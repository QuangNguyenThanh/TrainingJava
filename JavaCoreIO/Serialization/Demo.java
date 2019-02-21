package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo {
	public static void main(String[] args) throws IOException {
		Student student01 = new Student("Quang", 22);
		
		try {
			FileOutputStream fos = new FileOutputStream("JavaCoreIO//Serialization//data");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(student01);
            oos.close();
            fos.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
		
		try {
			FileInputStream fis = new FileInputStream("JavaCoreIO//Serialization//data");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student student02 = null;
			try {
				student02 = (Student) ois.readObject();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(student02);
			ois.close();
			fis.close();
		} catch (IOException i) {
            i.printStackTrace();
        }
	}
}

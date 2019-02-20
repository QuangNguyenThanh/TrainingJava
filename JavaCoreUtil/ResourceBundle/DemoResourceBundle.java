package ResourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class DemoResourceBundle {
	public static void main(String[] args) {
		int lang;
		Scanner sn = new Scanner(System.in);
		ResourceBundle bundle;
		do {
			System.out.println("1. English");
		    System.out.println("2. Vietnamese");
		    System.out.println("3. Exit program");
		    
		    System.out.print("Please choose your language: ");
		    
		    lang = sn.nextInt();
		    switch (lang) {
		     case 1:
		       //ResourceBundle is package name
		       //MessageBundle is properties file name
		       bundle = ResourceBundle.getBundle("ResourceBundle.MessageBundle", Locale.US);
		       System.out.println("Message in " + Locale.US
		                                + ": " + bundle.getString("greeting"));
		       break;
		     case 2:
		       //changing the default locale to Vietnamese 
		       Locale.setDefault(new Locale("vi", "VN"));
		       bundle = ResourceBundle.getBundle("ResourceBundle.MessageBundle");
		       System.out.println("Message in " + Locale.getDefault()
		                                + ": " + bundle.getString("greeting"));
		       break;
		    }
		   } while (lang != 3);
		sn.close();
	}
}

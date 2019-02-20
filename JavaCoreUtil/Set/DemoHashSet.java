package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class DemoHashSet {
	public static void main(String[] args) {
		Set<String> listProgramingLanguage = new HashSet<>();
		//add Language
		listProgramingLanguage.add("Java");
		listProgramingLanguage.add("C++");
		
		Scanner sn = new Scanner(System.in);
		String newLanguage;
		//Loop
		while (true) {
			System.out.print("Danh sách ngôn ngữ lập trình hiện có: ");
			show(listProgramingLanguage); //show list Programing language
			
			System.out.print("Nhập một ngôn ngữ lập trình mới: ");
			newLanguage = sn.nextLine();
			//Check break loop
			if (newLanguage.equalsIgnoreCase("exit")) {
				break;
			}
			//Add new programing language
			if (!listProgramingLanguage.add(newLanguage)) {
				System.out.println("Ngôn ngữ đã tồn tại.");
			} else {
				System.out.println("Thêm ngôn ngữ mới thành công");
			}
			System.out.println();
		}
		sn.close();
	}
	
	private static void show(Set<String> set) {
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		//set.forEach((language) -> System.out.print(language + " "));
		System.out.println();
	}
}

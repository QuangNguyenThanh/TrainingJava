package Map;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DemoTreeMap {
	public static void main(String[] args) {
		Map<String, String> dictionary = new TreeMap<>();
		
		//add item
		dictionary.put("Table", "Cái bàn");
		dictionary.put("Chair", "Cái ghế");
		dictionary.put("Student", "Học sinh");
		dictionary.put("Pen", "Cái bút");
		dictionary.put("Window", "Cửa sổ");
		dictionary.put("Phone", "Điện thoại");
		dictionary.put("Map", "Bản đồ");
		dictionary.put("Friend", "Bạn bè");
		dictionary.put("Teacher", "Giáo viên");
		dictionary.put("Snake", null);

		Scanner sn = new Scanner(System.in);
		String 	text;
		
		//loop
		while (true) {
			System.out.println("Chương trình từ điển Anh-Việt:");
			System.out.print("Nhập từ tiếng anh cần tìm kiếm: ");
			text = sn.nextLine();
			
			//check exit to break loop
			if (text.equalsIgnoreCase("exit")) {
				break;
			}
			
			//check input available
			if (dictionary.containsKey(text)) {
				String value = dictionary.get(text);
				if (value == null) {
					System.out.println(text + " chưa hỗ trợ dịch sang tiếng việt");
				} else {
					System.out.println("Nghĩa tiếng việt của " + text + " là: " + value);
				}
			} else {
				System.out.println("Từ tìm kiếm không tồn tại trong từ điển này.");
			}
			System.out.println();
		}
		
		sn.close();
	}
}

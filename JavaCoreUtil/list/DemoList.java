package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author Nguyễn Thanh Quang
 * Bài demo về list. Ở bài demo sử dụng ArrayList.
 * List là một interface trong java. Nó chứa các phương thức để chèn và xóa các phần tử dựa trên chỉ số index.
 * Có 2 loại list thường được sử dụng là ArrayList và LinkedList. Về cơ bản cả 2 tương đối giống nhau.
 * Một số điểm khác giữa ArrayList và LinkedList:
 * ArrayList sử dụng mảng để lưu trữ nên khi có các thao tác (thêm, xóa, sửa) sẽ chậm hơn LinkedList 
 * vì LinkedList sử dụng danh sách liên kết để lưu trữ
 * ArrayList thường được sử dụng trong việc lưu trữ và truy cập dữ liệu
 * LinkedList thường được sử dụng trong việc thao tác với dữ liệu (thêm, xóa, sửa)...
 */
public class DemoList {
	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();

		//Them phan tu vao list
		lst.add("A");
		lst.add("B");
		lst.add("C");
		lst.add("D");
		lst.add("F");
		lst.add("E");
		System.out.println(lst);
		
		//Duyet list bang for
		System.out.print("Duyet List bang for: ");
		for (String s : lst) {
			System.out.print(s + " ");
		}
		System.out.println();
		//Duyet list bang foreach java 8
		System.out.print("Duyet list bang foreach java 8: ");
		lst.forEach((s) -> System.out.print(s + " "));
		System.out.println();
		
		//Duyet list bang iterator
		System.out.print("Duyet list bang iterator: ");
		Iterator<String> itr = lst.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		
		//Duyet list bang listIterator
		System.out.print("Duyet list bang listIterator: ");
		ListIterator<String> lstItr = lst.listIterator(lst.size());
		while (lstItr.hasPrevious()) {
			System.out.print(lstItr.previous() + " ");
		}
		System.out.println();
		
		//Lay vi tri phan tu bang ham get
		System.out.println("Phan tu o vi tri thu 3: " + lst.get(3));
		
		//Tim kiem phan tu trong list bang ham contains
		//Ham contains lay ra phan tu co vi tri thap hon. Neu list co 2 phan tu trung nhau
		//thi se lay phan tu co vi tri nho hon.
		if (lst.contains("D")) {
			System.out.println("Co phan tu D trong list");
		} else {
			System.out.println("Khong co phan tu D trong list");
		}
		
		//Tim kiem vi tri cua 1 phan tu bang indexOf
		System.out.print("Vi tri phan tu 'E' trong list: ");
		System.out.println(lst.indexOf("E"));
		
		//Sap xep mang tang dan
		System.out.print("Sap xep mang tang dan: ");
		Collections.sort(lst);
		System.out.println(lst);
		//Dao mang
		System.out.print("Dao mang: ");
		Collections.reverse(lst);
		System.out.println(lst);
		
		//Cap nhat gia tri bang ham set
		System.out.print("Doi phan tu o vi tru 2 thanh 'Quang': ");
		lst.set(2, "Quang"); //Doi vi tri 2 thanh Quang
		System.out.println(lst);
		
		//Xoa phan tu trong list
		System.out.print("Xoa phan tu 'Quang': ");
		lst.remove("Quang"); //Xoa phan tu Quang
		System.out.println(lst);
		lst.remove(0); //Xoa phan tu dau tien
		System.out.println(lst);
		
		//Shuffle list. Moi lan se cho ra ket qua khac nhau
		Collections.shuffle(lst);
		System.out.println(lst);
	}
}

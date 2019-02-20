package demodesignpattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		BDSFactory factory = new BDSFactory();
		
		ChuBDS owner1 = new ChuBDS("Quang1", "Nguyen", "Thanh");
		KichThuocBDS size1 = new KichThuocBDS(10, 5);
		BatDongSan bds1 = factory.getBDS("DatTrong", owner1, size1, "01", 0, 0);
		
		ChuBDS owner2 = new ChuBDS("Quang2", "Nguyen", "Thanh");
		KichThuocBDS size2 = new KichThuocBDS(8, 5);
		BatDongSan bds2 = factory.getBDS("NhaO", owner2, size2, "02", 3, 0);
		
		ChuBDS owner3 = new ChuBDS("Quang3", "Nguyen", "Thanh");
		KichThuocBDS size3 = new KichThuocBDS(20, 15);
		BatDongSan bds3 = factory.getBDS("KhachSan", owner3, size3, "03", 0, 10);
		
		ChuBDS owner4 = new ChuBDS("Quang4", "Nguyen", "Thanh");
		KichThuocBDS size4 = new KichThuocBDS(20, 15);
		BatDongSan bds4 = factory.getBDS("Building", owner4, size4, "04", 5, 0);

		List<BatDongSan> lst = new ArrayList<>();
		lst.add(bds1);
		lst.add(bds2);
		lst.add(bds3);
		lst.add(bds4);
		
		Iterator<BatDongSan> itr = lst.iterator();
		while(itr.hasNext()) {
			BatDongSan t = (BatDongSan) itr.next();
			t.show();
			System.out.println("Gia ban: " + t.GiaBan());
			System.out.println("-----------------------------------");
		}
	}
}

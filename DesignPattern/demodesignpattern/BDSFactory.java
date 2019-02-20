package demodesignpattern;

public class BDSFactory {
	public BatDongSan getBDS(String type, ChuBDS owner, KichThuocBDS size, String maso, int solau, int sosao) {
		if(type == null) {
			return new NullBDS();
		}
		if (type.equalsIgnoreCase("DatTrong")) {
			return new DatTrong(owner, size, maso);
		} else if (type.equalsIgnoreCase("NhaO")) {
			return new NhaO(owner, size, maso, solau);
		} else if (type.equalsIgnoreCase("KhachSan")) {
			return new KhachSan(owner, size, maso, sosao);
		} else if (type.equalsIgnoreCase("BietThu")) {
			return new BietThu(owner, size, maso);
		}
		return new NullBDS();
	}
}

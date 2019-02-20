package demodesignpattern;

public class DatTrong extends BatDongSan {

	public DatTrong() {}
	
	public DatTrong(ChuBDS owner, KichThuocBDS size, String maso) {
		this.owner = owner;
		this.size = size;
		this.maso = maso;
	}
	
	@Override
	public double GiaBan() {
		// TODO Auto-generated method stub
		return getDienTich() * Constants.gia_1;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(owner);
		System.out.println("Dat Trong: ");
	}

}

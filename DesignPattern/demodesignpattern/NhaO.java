package demodesignpattern;

public class NhaO extends BatDongSan {
	private int solau;
	
	public NhaO(ChuBDS owner, KichThuocBDS size, String maso, int solau) {
		this.owner = owner;
		this.size = size;
		this.maso = maso;
		this.solau = solau;
	}

	@Override
	public double GiaBan() {
		// TODO Auto-generated method stub
		return getDienTich() * Constants.gia_1 + solau * Constants.gia_lau;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(owner);
		System.out.println("Nha O: ");
	}
	
}

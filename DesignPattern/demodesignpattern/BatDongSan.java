package demodesignpattern;

public abstract class BatDongSan {
	protected ChuBDS owner;
	protected KichThuocBDS size;
	protected String maso;
	
	abstract public double GiaBan();
	abstract public void show();
	
	public double getDienTich() {
		return size.dientich();
	}
}

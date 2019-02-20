package demodesignpattern;

public class BietThu extends BatDongSan implements IPhi {

	public BietThu(ChuBDS owner, KichThuocBDS size, String maso) {
		this.owner = owner;
		this.size = size;
		this.maso = maso;
	}
	
	@Override
	public double PhiKinhDoanh() {
		// TODO Auto-generated method stub
		return getDienTich() * Constants.phi_2;
	}

	@Override
	public double GiaBan() {
		// TODO Auto-generated method stub
		return getDienTich() * Constants.gia_3;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(owner);
		System.out.println("Biet Thu: ");
	}

}

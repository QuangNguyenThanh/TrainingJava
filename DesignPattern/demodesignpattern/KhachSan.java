package demodesignpattern;

public class KhachSan extends BatDongSan implements IPhi {
	private int sosao;

	public KhachSan(ChuBDS owner, KichThuocBDS size, String maso, int sosao) {
		this.owner = owner;
		this.size = size;
		this.maso = maso;
		this.sosao = sosao;
	}

	@Override
	public double PhiKinhDoanh() {
		// TODO Auto-generated method stub
		return size.getChieurong() * Constants.phi_1;
	}

	@Override
	public double GiaBan() {
		// TODO Auto-generated method stub
		return Constants.gia_2 + sosao * Constants.gia_sao;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(owner);
		System.out.println("Khach San: ");
	}

}

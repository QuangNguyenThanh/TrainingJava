package demodesignpattern;

public class KichThuocBDS {
	private double chieudai;
	private double chieurong;
	public KichThuocBDS(double chieudai, double chieurong) {
		super();
		this.chieudai = chieudai;
		this.chieurong = chieurong;
	}
	public double getChieudai() {
		return chieudai;
	}
	public void setChieudai(double chieudai) {
		this.chieudai = chieudai;
	}
	public double getChieurong() {
		return chieurong;
	}
	public void setChieurong(double chieurong) {
		this.chieurong = chieurong;
	}
	
	public double dientich() {
		return chieudai * chieurong;
	}
}

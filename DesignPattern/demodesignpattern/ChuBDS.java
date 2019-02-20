package demodesignpattern;

public class ChuBDS {
	private String ten;
	private String ho;
	private String holot;
	public ChuBDS(String ten, String ho, String holot) {
		super();
		this.ten = ten;
		this.ho = ho;
		this.holot = holot;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getHo() {
		return ho;
	}
	public void setHo(String ho) {
		this.ho = ho;
	}
	public String getHolot() {
		return holot;
	}
	public void setHolot(String holot) {
		this.holot = holot;
	}
	@Override
	public String toString() {
		return "Chu BDS: " + ho + " " + holot + " " + ten;
	}
	
}

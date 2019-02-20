package singletonpattern;

public class SinhVien {
	private static SinhVien instance;
	private SinhVien() {}
	private SinhVien(String name) {
		this.setName(name);
	}
	private String name;
	
	public static SinhVien getInstance(String name) {
		if (instance == null) {
			instance = new SinhVien(name);
		}
		return instance;
	}
	
	public void showInfo() {
		System.out.println(this.name);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

package main;

public class SinhVien {
	private String name;
	private String tuoi;
	
	public SinhVien() {}
	public SinhVien(String name, String tuoi) {
		this.setName(name);
		this.setTuoi(tuoi);
	}
	public String getTuoi() {
		return tuoi;
	}
	public void setTuoi(String tuoi) {
		this.tuoi = tuoi;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void showInfo() {
		System.out.println("Name: " + this.name + "\nAge: " + this.tuoi);
	}
}

package singletonpattern;

public class DemoSingleton {
	public static void main(String[] args) {
		SinhVien sv = SinhVien.getInstance("Quang");
		sv.showInfo();
		
		SinhVien sv1 = SinhVien.getInstance("Q");
		sv1.showInfo();
	}
}

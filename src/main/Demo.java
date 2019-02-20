package main;

public class Demo {
	public static void main(String[] args) {
		System.out.println("Sum 2 numbers: " + Sum(5, 5));
		System.out.println("Sum 3 numbers: " + Sum (5, 5, 5));
		
		SinhVien sv1 = new SinhVien("A", "20");
		SinhVien sv2 = new SinhVien("B", "21");
	}
	
	private static int Sum(int a, int b) {
		return a + b;
	}
	
	private static int Sum(int a, int b, int c) {
		return a + b + c;
	}
}

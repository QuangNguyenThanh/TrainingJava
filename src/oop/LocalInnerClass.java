package oop;

public class LocalInnerClass {
	private int data = 30;
	
	void display() {
		class Local {
			void mess() {
				System.out.println(data);
			}
		}
		Local local = new Local();
		local.mess();
	}
	
	public static void main(String[] args) {
		LocalInnerClass obj = new LocalInnerClass();
		obj.display();
	}
}

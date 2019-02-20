package oop;

public class DemoInnerClass {
	class Inner {
		void show() {
			System.out.println("Inner Class");
		}
	}
	
	public static void main(String[] args) {
		DemoInnerClass outer = new DemoInnerClass();
		DemoInnerClass.Inner inner = outer.new Inner();
		inner.show();
	}
}

package oop;

class Vehicle2 {
	Vehicle2() {
		System.out.println("Create Parent Class");
	}
}
public class UseSuper2 extends Vehicle2 {
	UseSuper2() {
		super();
		System.out.println("Create Child Class");
	}
	
	public static void main(String[] args) {
		UseSuper2 demo = new UseSuper2();
	}
}

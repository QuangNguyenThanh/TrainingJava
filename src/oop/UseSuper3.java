package oop;

class Vehicle3 {
	void run() {
		System.out.println("Parent Class is running...");
	}
}

public class UseSuper3 extends Vehicle3 {
	void run() {
		System.out.println("Child Class is running...");
	}
	
	void display() {
		run();
		super.run();
	}
	
	public static void main(String[] args) {
		UseSuper3 demo = new UseSuper3();
		demo.display();
	}
}

package oop;

class Vehicle {
	int speed = 50;
}

public class UseSuper1 extends Vehicle {
	int speed = 100;
	void display() {
		System.out.println("Parent: " + super.speed); //print speed Parent Class
		System.out.println("Child: " + speed); //print speed Child Class
	}
	
	public static void main(String[] args) {
		UseSuper1 demo = new UseSuper1();
		demo.display();
	}
}

package oop;

abstract class Person {
	abstract void speak();
}

public class AnonymousInnerClass {
	public static void main(String[] args) {
		Person p = new Person() {
			void speak() {
				System.out.println("Speaking...");
			}
		};
		p.speak();
	}
}

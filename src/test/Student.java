package test;

public class Student extends Person implements DemoInterface{

	public Student(String name, String tuoi) {
		super(name, tuoi);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("I'm a student.");
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("Student Student Student Student Student");
	}

}

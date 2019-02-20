package test;

public class Teacher extends Person implements DemoInterface{

	public Teacher(String name, String tuoi) {
		super(name, tuoi);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("I'm a teacher.");
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("Teacher Teacher Teacher Teacher Teacher");
	}

}

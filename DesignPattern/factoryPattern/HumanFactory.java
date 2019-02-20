package factoryPattern;

public class HumanFactory {
	public void sayHello(String humanType) {
		DemoFactoryPattern demo;
		if (humanType.equalsIgnoreCase("Student")) {
			demo = new SinhVien();
			demo.speak();
		} else if (humanType.equalsIgnoreCase("Teacher")) {
			demo = new Teacher();
			demo.speak();
		}
	}
}

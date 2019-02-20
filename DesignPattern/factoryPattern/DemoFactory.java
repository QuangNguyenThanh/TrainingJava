package factoryPattern;

public class DemoFactory {
	public static void main(String[] args) {
		HumanFactory listen = new HumanFactory();
		listen.sayHello("Student");
		listen.sayHello("Teacher");
	}
}

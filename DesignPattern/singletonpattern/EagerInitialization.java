package singletonpattern;

public class EagerInitialization {
	private static EagerInitialization instance = new EagerInitialization();

	public EagerInitialization() { }
	
	public static EagerInitialization getInstance() {
		return instance;
	}
}

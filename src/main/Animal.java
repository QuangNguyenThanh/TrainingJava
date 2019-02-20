package main;

public class Animal {
	private String name;
	
	public Animal() {}
	
	public Animal(String name) {
		this.setName(name);
	}
	protected String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

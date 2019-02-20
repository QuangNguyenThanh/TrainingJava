package test;

public abstract class Person {
	private String name;
	private String tuoi;
	
	public Person(String name, String tuoi) {
		this.setName(name);
		this.setTuoi(tuoi);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTuoi() {
		return tuoi;
	}

	public void setTuoi(String tuoi) {
		this.tuoi = tuoi;
	}
	
	public abstract void sayHello();
}

package main;

interface Printable {  
	void print();  
}  
interface Showable {  
	void print();  
}  
  
public class TestInterface1 implements Printable,Showable{  
	public void print(){System.out.println("Hello");}  
	public static void main(String args[]){  
		TestInterface1 obj = new TestInterface1();  
		obj.print();  
	}  
}  

package Enum;

public class Demo {
	enum Day {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}
	
	public static void main(String[] args) {
		System.out.println("pageID: " + DemoEnum.PAGE_001.getPageID());
		System.out.println("pageTitle: " + DemoEnum.PAGE_001.getPageTitle());
		System.out.println("pageURL: " + DemoEnum.PAGE_001.getPageURL());
		System.out.println();
		
		for (Day d : Day.values()) {
			System.out.print(d + " ");
		}
		System.out.println();
		
	}
}

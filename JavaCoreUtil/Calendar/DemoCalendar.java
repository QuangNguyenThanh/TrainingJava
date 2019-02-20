package Calendar;

import java.util.Calendar;

public class DemoCalendar {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println("Ngay gio hien tai: " + calendar.getTime());
		System.out.println("YEAR: " + calendar.get(Calendar.YEAR)); //get year
        System.out.println("MONTH: " + calendar.get(Calendar.MONTH)); //get month
        System.out.println("DAY: " + calendar.get(Calendar.DATE)); //get day
        System.out.println("DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK)); //get day of week

		//add 10 days on the current date
		calendar.add(Calendar.DATE, 10);
		System.out.println("10 ngay sau: " + calendar.getTime());
		
		//add 2 months on the current date
		calendar.add(Calendar.MONTH, 2);
		System.out.println("2 thang sau: " + calendar.getTime());
		
		//add 1 year on the current date
		calendar.add(Calendar.YEAR, 1);
		System.out.println("1 nam sau: " + calendar.getTime());
	}
}

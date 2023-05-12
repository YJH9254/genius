package study0511p;

import java.util.Calendar;

public class CalendarTest2 {
	
	public static void main(String[] args) {
		
		String aa = "1498137807001";
		
	long a1 = (Long.parseLong(aa)/1000) + ;
	Calendar cal = Calendar.getInstance();
	cal.set(2021,11,25);
	
	int yy = cal.get(Calendar.YEAR);
	int mm = cal.get(Calendar.MONTH);
	int dd = cal.get(Calendar.DATE);
	
	int ww = cal.get(Calendar.DAY_OF_WEEK);
	
	System.out.println(yy+"년"+mm+"월"+dd+"일");
	
	}

}

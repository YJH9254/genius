package study0511;

import java.util.Calendar;

public class unixTimeTest1 {

	public static void main(String[] args) {
		Calendar cal1 = Calendar.getInstance();
		long unix = cal1.getTimeInMillis();
		System.out.println( unix );
		
		long unix2 = 283702832533L;
		cal1.setTimeInMillis(unix2);
		System.out.println(unix2);
		
		int yy = cal1.get(Calendar.YEAR);
		int mm = cal1.get(Calendar.MONTH)+1;
		int dd = cal1.get(Calendar.DATE);
		
		System.out.println( yy+"/"+mm+"/"+dd);
	}
}

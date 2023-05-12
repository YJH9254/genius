package study0511;

import java.util.Calendar;

public class unixTimeTest2 {

	public static void main(String[] args) {
		Calendar cal1 = Calendar.getInstance();
		long u1 = cal1.getTimeInMillis()/1000;
		
		cal1.set(2023,11,25);
		long u2 = cal1.getTimeInMillis()/1000;
		int r1 = (int)((u2 - u1) / (60*60*24));
		System.out.println("올해의 크리스마스는 " + r1 + "일 남았습니다.");
		
		
	}
}
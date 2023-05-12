package study0511;

import java.util.Calendar;

public class CalendarTest1 {

	public static void main(String[] args) {
		// Calendar cal2 = new Calendar();
		Calendar cal = Calendar.getInstance(); // 인스턴스화
		int year = cal.get(1); //(Calendar.YEAR);
			//Calendar 클래스 안에 get이 있음. get이 연,월,일 출력함.
		int month = cal.get(2) + 1;
		int date = cal.get(5);
		System.out.println( year+"/"+month+"/"+date );
		
		cal.add(Calendar.MONTH,15);
		year = cal.get(1); 
		month = cal.get(2) + 1;
        date = cal.get(5);
        System.out.println( year+"/"+month+"/"+date );
        
		int h = cal.get(Calendar.HOUR_OF_DAY);
		int mi = cal.get(Calendar.MINUTE);
		int s = cal.get(Calendar.SECOND);
		System.out.println( h+"시"+mi+"분"+s );
		
		System.out.println("am/pm:"+ cal.get(Calendar.AM_PM) );
		System.out.println("현재 요일:"+ cal.get(Calendar.DAY_OF_WEEK) );
		System.out.println("올해 몇 번째 날:"+ cal.get(Calendar.DAY_OF_YEAR) );
		System.out.println("올해 몇 번째 주:"+ cal.get(Calendar.WEEK_OF_YEAR) );
		System.out.println("이번 달의 몇 번째 주:"+ cal.get(Calendar.WEEK_OF_MONTH) );
		System.out.println("이번 달의 마지막 날:"+ cal.getActualMaximum(Calendar.DATE) );
		
		
	}
}

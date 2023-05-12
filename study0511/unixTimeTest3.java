package study0511;

import java.util.Calendar;

public class unixTimeTest3 {
	
	
	// public:모든 클래스에서 사용가능 static: 클래스명으로 접근하는 메소드 
	public static int doomday(String date) {
		
		Calendar cal1 = Calendar.getInstance();
		
		// 지금 시점의 유닉스시간(초단위)
		long u1 = cal1.getTimeInMillis()/1000;
		// date = "2023-12-25";
		String[] str = date.split("-");
		// str[0]="2023"; str[1]="12"; str[2]="25";
		
		int yy = Integer.parseInt(str[0]);
		int mm = Integer.parseInt(str[1]);
		int dd = 
				Integer.parseInt(str[2]);
		
		cal1.set(yy,mm-1,dd);
		// 사용자가 보내준 시점의 유닉스시간(초단위)
		long u2 = cal1.getTimeInMillis()/1000;
		
		int r1 = (int)((u2 - u1) / (60*60*24));
		
		return r1;
		}
		public static void main(String[] args) {
		
		Calendar cal1 = Calendar.getInstance();
		long u1 = cal1.getTimeInMillis()/1000;
		
		cal1.set(2023,11,25);
		long u2 = cal1.getTimeInMillis()/1000;
		int r1 = (int)((u2 - u1) / (60*60*24));
		
		System.out.println("디데이"+r1);
		System.out.println(doomday("2023-12-25"));
		}
}

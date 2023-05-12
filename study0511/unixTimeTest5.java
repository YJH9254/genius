package study0511;

import java.util.Calendar;

public class unixTimeTest5 {
	
	public static int doomday(String d1, String d2) {
		
		Calendar cal1 = Calendar.getInstance();
		
		d1 = "";
		d2 = "";
		
		String[] ar1 = d1.split("-");
		int yy1 = Integer.parseInt(ar1[0]);
		int mm1 = Integer.parseInt(ar1[1]);
		int dd1 = Integer.parseInt(ar1[2]);
		
		String[] ar2 = d2.split("-");
		int yy2 = Integer.parseInt(ar2[0]);
		int mm2 = Integer.parseInt(ar2[1]);
		int dd2 = Integer.parseInt(ar2[2]);
		
		Calendar cal = Calendar.getInstance();
		cal.set(yy1,mm1-1,dd1);		// d1
		long u1 = cal.getTimeInMillis()/1000;
		
		cal.set(yy2,mm2-1,dd2);		// d2
		long u2 = cal.getTimeInMillis()/1000;
		
		int result = (int)((u2 - u1)/(60*60*24));
		return result;
	}
	public static void main(String[] args) {
		
		Calendar cal1 = Calendar.getInstance();
	
		String d1 = "2023-05-01";
		String d2 = "2023-06-23";
		
		String[] ar1 = d1.split("-");
		int yy1 = Integer.parseInt(ar1[0]);
		int mm1 = Integer.parseInt(ar1[1]);
		int dd1 = Integer.parseInt(ar1[2]);
		
		String[] ar2 = d2.split("-");
		int yy2 = Integer.parseInt(ar2[0]);
		int mm2 = Integer.parseInt(ar2[1]);
		int dd2 = Integer.parseInt(ar2[2]);
		
		Calendar cal = Calendar.getInstance();
		cal.set(yy1,mm1-1,dd1);		// d1
		long u1 = cal.getTimeInMillis()/1000;
		
		cal.set(yy2,mm2-1,dd2);		// d2
		long u2 = cal.getTimeInMillis()/1000;
		
		int result = (int)((u2 - u1)/(60*60*24));
		System.out.println(d1+"과 "+d2+"의 차이는 "+result+"일 입니다.");
		
		
	}

}

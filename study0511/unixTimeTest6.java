package study0511;

import java.util.Calendar;

public class unixTimeTest6 {

	public static void main(String[] args) {
		// 주어진 유닉스 값에서 60일 이후 년월일 출력
		//					1683772832533
		//  문자->숫자 Integer.parseInt();
				String aa = "1498137807001";
		// add, (60*60*24)*60
		//int a1 = Integer.parseInt(aa); 안됨
		long a1 = (Long.parseLong(aa)/1000) + ((60*60*24)*60);
		
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(a1*1000);
		int yy = cal.get(Calendar.YEAR);
		int mm = cal.get(Calendar.MONTH)+1;
		int dd = cal.get(Calendar.DATE);
		
		cal.add(Calendar.DATE,-60);
		yy = cal.get(Calendar.YEAR);
		mm = cal.get(Calendar.MONTH)+1;
		dd = cal.get(Calendar.DATE);
		
		System.out.println( yy+"/"+mm+"/"+dd);
		
	}
}

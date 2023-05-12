package study0512;

import java.util.Calendar;

public class CalendarTest1 {
					
	public static void calView(String ym) { 
		
		Calendar cal = Calendar.getInstance();
		
		String[] ym2 = ym.split("-");
		// ym2[0] = "2023"    ym2[1] = "12";
		// Integer.parseInt
		int yy = Integer.parseInt(ym2[0]);
		int mm = Integer.parseInt(ym2[1]);
		
		cal.set(yy,mm-1,1);
	
	
	int week = cal.get(Calendar.DAY_OF_WEEK); 
	int lastDay = 31; 
	int ln = 0;
	
	for(int w=1; w<week;w++) {
		System.out.print("\t");
		ln++;
	}
	for( int d=1; d<=lastDay; d++ ) {
	
		if (d<10) {
			System.out.print(" ");
			}
		System.out.print(d + "일\t");
		ln++; 
		if( ln == 7 ) {
			System.out.println(); 
			ln = 0;
}
}
}
	public static void main(String[] args) {
		CalendarTest1.calView("2023-12");
		
	}
}
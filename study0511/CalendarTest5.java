package study0511;

import java.util.Calendar;

public class CalendarTest5 {
		
	public static void main(String[] args) {
		
		// 인스턴스(객체)화
		Calendar cal = Calendar.getInstance();
		
		int yy = 2023;
		int mm = 3;
		
		// 출력날짜 세팅
		cal.set(yy,mm-1,1);
		
		// 세팅 날짜의 요일을 얻음
		int week = cal.get(Calendar.DAY_OF_WEEK); // 4(수)
		// 세팅 날짜의 마지막일 얻음
		int lastDay = 31; // 이번달의 마지막 날짜 
		// 한줄에 7칸을 맞추는 용도
		int ln = 0;
		
		System.out.println( "( "+yy+"년 "+mm+"월 ) \n ");
		
		// 달력의 첫날(1일) 출력전의 공백 발생
		for(int w=1; w<week;w++) {
			System.out.print("\t");
			ln++;
		}
		// ln = 3
		for( int d=1; d<=31; d++ ) {
		
			if (d<10) {
				System.out.print(" ");
				}
			System.out.print(d + "일\t");
			ln++; // d=1, ln=2, d=2, ln=3
			if( ln == 7 ) {
				System.out.println();  // 대행
				ln = 0;
			}
		}
	}
	}

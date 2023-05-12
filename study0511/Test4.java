package study0511;

import java.util.Calendar;
import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
	Calendar cal = Calendar.getInstance();	
	Long u1 = cal.getTimeInMillis();
	
	int r = (int)(Math.random()*10) + 1;
	Scanner scn = new Scanner(System.in);
	int cnt = 0;
	while(true) {
		System.out.println("숫자입력>>");
		int a = scn.nextInt();
		if( r == a ) {
			System.out.println(a+"입력, 정답입니다!!!");
			break;
		} else { 
			System.out.println(a+"입력, 오답임~~");
		}
		cnt++;
		if( cnt == 20 ) break;
	}
	cal = Calendar.getInstance();
	long u2 = cal.getTimeInMillis();
	long result = (int)((u2 - u1)/1000);
	System.out.println("시간 : " + result + "초");
	}
}
	

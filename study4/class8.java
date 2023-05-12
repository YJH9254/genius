package study4;

public class class8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 1990;
		System.out.println( "나이:" + myAge1(year) );
	} // byte(127) < short(32000) < int(21억) < long
	public static byte myAge1(int a) {   // 매개변수: 외부값을 받는 변수
										 
		int t_year = 2023;
		int age = t_year - a;
		
		return (byte)age;
	}
	
}

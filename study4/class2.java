package study4;

public class class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String jumsu = "eng: 70,kor:90,math:88";
		//String[] jj = {"eng:70,kor:90,math:88"};
		String[] jj = jumsu.split(",");
		for( int i=0; i<jj.length; i++ ) {
			System.out.println( jj[i] );
		}
		for( int i=0; i<jj.length; i++ ) {
			System.out.print( jj[i].split(":")[1] + " " );
		}
		System.out.println();
		
		// [물어보기5]
		String birthday = "1990/05/27";
		// 90년 5월 27일 생
		// String[] bb = {"1990", "05","27"};
		String[] bb = birthday.split("/");
		
		String yy = bb[0].substring(2); // 1990
		// String mm = bb[1];substring(1,2); // 05
		String mm1 = bb[1].charAt(1) + ""; // 문제 1개
		String dd = bb[2];                                   
		
		System.out.println("90년 5월 "+dd+"일 생");
		
		//[풀어쓰기 6]
		String str = "java";
		System.out.println( ""+str.substring(0,1) ); //0~0
		System.out.println( " "+str.substring(1,2) ); //1~1
		System.out.println( "  "+str.substring(2,3) ); //2~2
		System.out.println( "    "+str.substring(3,4) ); //3~3
		// 0 ~ 3
		for( int i=0; i<str.length(); i++ ) {
			for( int j=0; j<i; j++ ) {
			System.out.print(" ");
			}
			System.out.println( str.substring(i,i+1) );


              }
          }
}
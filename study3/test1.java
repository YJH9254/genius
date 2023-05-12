package study3;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		while( true ) {
			Scanner scn = new Scanner(System.in);
			System.out.print("양수를 입력해주세요.(종료:-1) >>");
			int number = scn.nextInt();
			if( number == -1 ) {
				System.out.println("종료합니다.");
				break; 
			}
			else if( number >= 0 ) {
			System.out.println( number +"을 입력했습니다." );
		}
	}
}
}

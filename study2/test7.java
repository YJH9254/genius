package study2;

import java.util.Scanner;

public class test7 {

	public static void main(String[] args) {
		// Scanner 클래스 : 콘솔창에 입력상태를 제공
		Scanner scn = new Scanner(System.in);
		System.out.print("연차를 입력 : ");
		
		int emp_A_year = scn.nextInt(); // nextInt() 메소드
		
		String grade = "";
		
		if(emp_A_year >= 15 ) {
			grade = "특급";
		} else if ( emp_A_year >= 10 ) {
			grade = "고급";
		} else if ( emp_A_year >= 6 ) {
			grade = "중급";
		} else {
			grade = "초급"; 
		} 
		System.out.println("A사원의 연차는 "+emp_A_year+"년으로 "+grade+"이다. ");
	
	}
}


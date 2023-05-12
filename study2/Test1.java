package study2;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String result3 = (apple>=80)?"A등급":(apple>=60)?"B등급":"C등급";
		//
		//System.out.println("사과 당도 :" +result3);
		
		int number = 10;
		
	System.out.println( ( (number>0)?"양수":
						  (number<0)?"음수":"0" )+" 입니다. ");
		
	Scanner scn = new Scanner(System.in);
		
    System.out.print("점수입력: ");
		int score = scn.nextInt();
		String result4 = (score>=90)?"A":
						   (score>=80)?"B":
						   (score>=70)?"C":
						   (score>=60)?"D":"F";
		System.out.println( score + "점은 : " + result4 + "학점");
	}

}

package study1000;

public class Test1 {

		public static void main(String[] args) {
		
			int v1 = 15;
			int v2 = 0;
			if(v1>10) {
				//int v2;
				v2 = v1 - 10; // v2 = 5;
			}
			int v3 = v1 + v2 + 5; // 잘못된 코딩 v2는 if문 내에서만 사용가능
		 System.out.println("v3값은" +v3+ "입니다.");
		 
		 //58p
		 int sum;
		 int score1 = 0;
		 int score2; // score2 = null; (무존재지만 재정의 가능)
		 //System.out.println( score2 );
		 //sum = score1+score2; // score2=null값이기에 오류생김.
		 sum = score1 + 100;
		 
		 //66p
		 System.out.println("번호\t이름\t직업");
		 System.out.println("행 단위 출력\n");
		 System.out.println("행 단위 출력\n");
		 System.out.println("우리는 \"개발자\" 입니다.");
		 
		 int score = 79;
		 //char grade = 'A'; // A or B or C
		 char grade1 = (score>90)?'A':'B';
		 char grade2 = (score>90)?'A':(score>80)?'B':'C';
		 System.out.println( "score + " + grade2 );
		}
}

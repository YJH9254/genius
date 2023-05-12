package study2;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[][] engs = {{30,80,90},{60,70,90}};
	System.out.println( engs[0][0] );
	System.out.println( engs[0][1] );
	System.out.println( engs[0][2] );
	
	System.out.println( engs[1][0] );
	System.out.println( engs[1][1] );
	//System.out.println( engs[3][2] );
	
	System.out.println("-----"); 
	
	int[][][] school = { 
			
			{ {30,80,90},{50,20,70} },
	
			{ {70,90,50},{50,20,70},{70,90,80} } };
	// 2학년 3반 1번 학생 점수
	System.out.println( school[1][1][0] );
	
	// 1학년 1반 3번 학생 점수
	System.out.println( school[0][0][2] );
	
	// 2학년 3반 2번 학생 점수
	System.out.println( school[1][2][1] );
	}
}
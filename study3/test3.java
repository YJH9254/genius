package study3;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int[][] classA = { {90,80,70},{50,100,100} };
	
	//classA[0]
	int[] hap = new int[2];
	
	for( int i=0; i<classA.length; i++ ) {
		for( int j=0; j<classA[i].length; j++ ) {
			System.out.println( classA[i][j] );
			hap[i] += classA[i][j];
		}
		
	}
	
	
	System.out.println("1반 총점:240점/평균:80점");
	System.out.println("2반 총점:250점/평균:83점");
	System.out.println("전체평균:81점");
	
	}
}
		

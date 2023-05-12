package study2;

public class Test4 {

	public static void main(String[] args) {
		// var color = ["","",""];
        // 문자열 타입의 배열, 숫자 타입의 배열
		String[] color = {"blue","yellow","green"};
		int[] score = {98,88,92};
		// String[] str = {"aa","bb",77}; 문자, 숫자 혼용x
		
		byte[] a1 = {50,60,70};
		short[] a2 = {60,90,100};
		int[] a3 = {98,88,92};
		long[] a4 = {1000L,3000L,5000L};
		
		System.out.println( a1 ); // 정상출력 x
		System.out.println( a1[0] +','+ a2[1] +','+ a3[2]);
		System.out.println( "long: " +a4[0]); //
		//System.out.println( "long: " +a4[5]);
		
		float[] f1 = {70,7f,44,7f,100,0f};
		System.out.println( "float : " + f1[0] ); // 70.7
		
		double[] d1 = {77.7,33.12,99.5};
		double d2 = 12;
		System.out.println("double : "+ d2);
		
		System.out.println();
	}

}

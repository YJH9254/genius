package study2;

public class Test2 {
	
	public static void main(String[] args) {
		// byte short int long
		byte a = 127; // -128 ~ 127
		short b = 32767; // -32768 ~ 32767
		//int c = 2150000000;
		long d = 300000000000L;
		
		float f1 = 3.14f;
		float f2 = 3.12121212f;
		double db1 = 3.1212121212121212;
		System.out.println(f2);
		System.out.println(db1);
		
		char c1 = 'a'; // ok
		c1++;
		c1++;
		System.out.println("char c1 : " + c1);
		//char c2 = 'ab';  // x
		//char c3 = "a"; // x
		char c4 = '가'; //o
		c4++;
		c4++;
		c4++;
		c4++;
		System.out.println("char c4 : " + c4);
		
		String s1 = "a";
		System.out.println("String s1 : " +s1);
		
		
		char c3 = 'a'; // 97
		char c5 = 98; // b
		System.out.println( "c5 : " + c5 );
		
		
	}
}





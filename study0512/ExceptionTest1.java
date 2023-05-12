package study0512;

public class ExceptionTest1 {
	public static void main(String[] args) {
		// 1. zero error - 나누기
		// 2. index number error - 배열
		// 3. 형변환 error
		String a1 = "abc";
		String a2 = "123";
		int a3 = 0;
		int a4 = 0;
		try {
		a3 = Integer.parseInt(a1);
		a4 = Integer.parseInt(a2);
		System.out.println(a3);
		} catch (NumberFormatException e) {
			System.out.println("형변환 오류");
		} catch (Exception e) {
			System.out.println("오류!!");
		}
		System.out.println(a4);
		System.out.println();
		System.out.println();
		
		String str = "abc";
		// StringIndexOutOfBoundsException
		try {
			System.out.println(3);
		
		System.out.println( str.charAt(3));
	} catch ( StringIndexOutOfBoundsException e ) {
		System.out.println("문자열 자리번호 오류");
	} catch ( Exception e ) {
		System.out.println("오류!!");
	}
}
}

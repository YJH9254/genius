package study0508;



public class p2 {
	public static void split_number(double a) {
		String b = a + ""; // 숫자->문자 ; b = "97.123";
		String[] ar1 = b.split("\\.");
		System.out.println("정수:"+ar1[0]+" /실수:0."+ar1[1]);
		}
	public static void main(String[] args) {
		split_number(97.123); // 내부출력
		
		}
	
	}


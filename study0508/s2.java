package study0508;

public class s2 {
	
	// 인스턴스 변수
	int a = 0;
	int b = 0;
	int c = 0;
	// 클래스(공유, 전역) 변수
	static int d = 0;
	
	// 인스턴스 메소드
	public int sum1() {
		int result = a+b+c;
		return result;
	}
	// 클래스(공유, 전역) 메소드
	public static int sum2() {
		int result = a+b+c;
		return result;
	}
	
	public int avg1() {
		   int result = (a+b+c)/3;
				   return result;
			   }
		
	
	
	public static void main(String[] args) {
		
	  // 김철수(90,80,70),홍길동(70,78,88)
	  //study0508 패키지 내에서 s1 class 를 인용.
	  s2 kim = new s2(); // 인스턴스(객체)화
	  s2 hong = new s2();
	  kim.a = 90;
	  kim.b = 80;
	  kim.c = 70;
	  
	  hong.a = 70;
	  hong.b = 78;
	  hong.c = 88;
	  
	
	  System.out.println("김의 합계: " + kim.sum1());
	  System.out.println("홍의 합계: " + hong.sum1());
	  System.out.println("김의 평균: " + kim.avg1());
	  System.out.println("홍의 평균: " + hong.avg1());
	
	}
}

package study0508;

class s4 {
	int a = 0;
	int b = 0;
	int c = 0;
	int result = 0;
	public int hap() {
		result = a + b + c;
		return result;
	}
	public double avg( ) {
		return result/3;
	}
}

public class s3 {
	public static void main(String[] args) {
		c1 kim = new c1();
		c1 hong = new c1();
	
		kim.a = 80;
		kim.b = 70;
		kim.c = 90;
		System.out.println("김의 합계: "+kim.hap());
		System.out.println("김의 평균: "+kim.avg());
		
	}

}

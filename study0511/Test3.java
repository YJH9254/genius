package study0511;

interface Test2 { // 추상화
	public int hap();  // 메소드의 명세화
}
class Test3 implements Test2 { // 상속
	// 멤버변수, 인스턴스(객체)변수
	private String name;
	private int eng;
	private int kor;
	// 멤버변수, 클래스변수(전역변수)
	static String title;
	
	public int hap() {   // 다형성 > 오버라이딩
		return eng+kor;
	}
	public int hap(int a, int b) { // 다형성 > 오버로딩
		return a+b;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng=eng;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor=kor;
	}
}

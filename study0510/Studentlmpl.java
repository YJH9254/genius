package study0510;


public class Studentlmpl extends StudentService {     // 추상클래스를 상속 받는다.
	// 접근지정자를 설정하여 직접 접근을 차단한다.
	private String name;
	private int eng;
	private int kor;
	
	public int sum() {
		return eng + kor;
	}
	public int avg() {
		return sum()/2;
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
		this.eng = eng;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}

}
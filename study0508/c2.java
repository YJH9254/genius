package study0508;

public class c2 {

	int a = 10; // 멤버변수, 인스턴스변수
	public c2() {  }  // 생성자의 기본
	{	System.out.println("- c2 클래스의 객체화 -");
	}
	// 생성자의 다형성>오버로딩
	
	public c2(String a) { //생성자의 기본
		System.out.println("- c2 클래스의 객체화 -");
	}
	public static void main(String[] args) {
		c2 C1 = new c2();
		c2 C2 = new c2("abc");
		System.out.println(C2.a);
    }

}

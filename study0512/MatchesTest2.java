package study0512;

public class MatchesTest2 {

	public static void main(String[] args) {
	
	// 생년월일을 체크하는 패턴
	String birthday = "1980-02-22";
	String pattern="[0-9]{4}-[0-9]{1,2}-[0-9]{1,2}";
	if(birthday.matches(pattern)) {
		System.out.println("올바른 날짜");
	} else {
		System.out.println("올바른 날짜 아님");
	}
	// 특정 단어 검색
	String str = "공지사항 게시판 이미지";
	if(str.matches(".*게시판.*")) {
		System.out.println("문자열 있음!");
	} else {
		System.out.println("문자열 없음!");
	}
	
	// 숫자 유무 체크
	String txt1 = "0312312";
	if(txt1.matches(".*[0-9].*")) {
		System.out.println("숫자 있음!");
	} else { 
		System.out.println("숫자 없음!");
	}
	
	// 핸드폰 번호 체크
	String phone = "010-222-1234";
	pattern = "01(0|1|[6-9])-[0-9]{3,4}-[0-9]{4}";
	if(phone.matches(pattern)) {
		System.out.println("올바른 핸드폰 번호");
	} else {
		System.out.println("핸드폰번호를 다시 확인해주세요.");
	}
	                   
	//한글체크
	String name = "홍길동";
	pattern = "[가-힣]+";
	boolean result = name.matches(pattern);
	System.out.println("이름 체크: "+result);
	
	// 회원아이디체크 (영문, 숫자, 특수문자(_,-,$)를 포함한 6~12자)
	String userid = "test123";
	pattern = "(^[a-zA-Z]+[a-zA-Z0-9_-]+){5,11}";
	System.out.println("아이디: "+userid.matches(pattern));
	
	
	// 회원명체크 ( 한글 또는 영문으로 2자~50자 )
	String name = "Hong길동";
	pattern = "^[a-zA-Z가-힣]{2,50};+"
	System.out.println("이름: "+name.matches(pattern));
	
	// 학점체크 ( A~D,F,+,- )
	String hakjum = "A+";
	pattern = "(A|B|C|D|F){1}(\\+|-)?";
	System.out.println( "학점: " + hakjum.matches(pattern));
	
	// 공백여부체크
	String content = "cc";
	pattern = "[^[:space:]]";
	System.out.println("content: " + content.matches(pattern";)
	
	
	
	// 이메일체크
	// 영문,숫자,-,_ @영문,숫자 . 영문,숫자 
	// 영문으로 시작+(영,숫,-,_) 1개이상@(영문,숫자).(영문)
	String email1 = "abc123@naver.com";
	String email2 = "#abc@korea.co.kr";
	String email3 = "abc@korea";
	// 정규표현식 . + ? 같은게 아닌 _ - @ 는 그냥 문자 그대로 쓰면 된다.
	// 정규표현식 . + ? 을 쓰고 싶으면 \\ 를 쳐라! 
	pattern = "^[a-zA-Z]+[a-zA-Z0-9_-]*@[a-zA-Z0-9]+\\.[a-zA-Z]+$";
	System.out.println();
	System.out.println("email:" + email1.matches(pattern));
	}
}
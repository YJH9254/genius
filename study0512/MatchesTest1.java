package study0512;

public class MatchesTest1 {
	
	public static void main(String[] args) {
		
		String title = "";
		String pattern=".+";	// 임의의 문자가 한개 이상 있어야 한다.
		System.out.println(title.matches(pattern)); // true
		// ex2
		String color1 = "red";
		String color2 = "ared";
		String color3 = "redabc";
		String color4 = "readabc";
		pattern = "^red.*";	// red로 시작하고 뒤에 문자열이 있거나 없어도 true이다.
		System.out.println(color1.matches(pattern)); // true
		System.out.println(color2.matches(pattern)); // false
		System.out.println(color3.matches(pattern)); // true
		System.out.println(color4.matches(pattern)); // false
		
		// ex3 
		String color5 = "yellow";
		String color6 = "green";
		pattern = "^(r|y|b)";  // "r" or "y" or "b" 로 시작
		System.out.println(color5.matches(pattern)); // true
		System.out.println(color6.matches(pattern)); // false
		
		// ex4
		String gender = "M";
		pattern = "(M|F)";
		System.out.println(gender.matches(pattern));
		
		// ex5 (숫자만)
		String str = "20201225";
		// 영문으로 시작하고, 영문 1개이상, 영문으로 끝나야함
		pattern = "^[a-zA-Z]+$";
		System.out.println(str.matches(pattern));
	}
}

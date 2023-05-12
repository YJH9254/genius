package study0508;

public class Books {
	
	String bookName = "JSP기초";
	//생성자 : 메소드와 같은 모습을 하면서 객체화 될때 자동실행 됨.
	public Books() {
		System.out.println("한빛미디어");
	}
	//생성자 오버로딩
	public Books(String name) {
		bookName = name;
	}
	public static void main(String args[]) {
		Books myBook = new Books();				// 한빛미디어
		Books yourBook = new Books("JAVA");
		System.out.println(myBook.bookName);	// JSP기초
		System.out.println(yourBook.bookName);  // JAVA
	}

}

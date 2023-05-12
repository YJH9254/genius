package study0510;

class Program1 {
	public void pgName() {
		System.out.println("JAVA");
	}
}
public class Program2 extends Program1 {
	public void pgName() {
		System.out.println("JSP");
	}
	public void programAll() {
		super.pgName();
		//this.pgName();
	}
}
public class SuperThisExam{
	public static void main(String args[]) {
		Program2 p2 = new Program2();
		p2.pgName();
		p2.programAll();
	}
}
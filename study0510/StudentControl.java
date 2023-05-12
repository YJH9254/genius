package study0510;

public class StudentControl {
	public static void main(String[] args) {
		int avg = 0;
		
		Studentlmpl s1 = new Studentlmpl();
		s1.setName("장발산");
		s1.setEng(70);
		s1.setKor(80);
		
		
		System.out.println(s1.getName()+","+s1.sum());
		
	}
}

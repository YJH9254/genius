package study0510;

public class StudentInfo extends StudentVO {
	
	public int sum() {
		return getEng() + getKor();
	}
	public int avg() {
		return sum()/2;
	}
		
		public static void main(String[] args) {
		
			StudentInfo s = new StudentInfo(); // 인스턴스(객화)화
			
			s.setName("김철수");
			s.setYear(1);
			s.setEng(90);
			s.setKor(80);
			
			int hap = s.sum();
			int avg = s.avg();
			System.out.println("이름: "+s.getName() );
			System.out.println("합계: "+s.sum() );
			System.out.println("평균: "+s.avg() );
			
		}
}

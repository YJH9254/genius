package study0511;

public class CompanyInfo2 {

	public static void main(String[] args) {
		CompanyInfo companyInfo2=CompanyInfo.getInstance();
		
		//setter로 접근
		companyInfo2.setCompanyName("회사명");
		companyInfo2.setCompanyAddr("회사주소");
	}
}

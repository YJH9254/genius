package study0511;

public class CompanyInfo3 {

		public static void main(String[] args) {
			CompanyInfo companyInfo3 = CompanyInfo.getInstance();
			
			System.out.println( "companyName: "+companyInfo3.getCompanyName());
			System.out.println( "companyAddr: "+companyInfo3.getCompanyAddr());
			
			
		}
}

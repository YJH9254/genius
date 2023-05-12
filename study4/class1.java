package study4;

public class class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jumsu = "eng: 70,kor:90,math:88";
		//String[] jj = {"eng:70,kor:90,math:88"};
		String[] jj = jumsu.split(",");
		for( int i=0; i<jj.length; i++ ) {
			
			System.out.println( jj[i] );
		}
		
	}	

}

	



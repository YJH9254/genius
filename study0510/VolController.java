package study0510;

public class VolController {
	
	public static void main(String[] args) {
		VolMake tv = new VolMake();
		VolMake radio = new VolMake();
		
		tv.volUp(10);
		System.out.println(tv.getVolLevel());
	}

}

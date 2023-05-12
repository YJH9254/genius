package study0510;

public class CarVolController {
	public static void main(String[] args) {

		CarVolMake Caraudio = new CarVolMake();
		Caraudio.volUp(30);
		System.out.println(Caraudio.getCarvolLevel());
		Caraudio.volDown(5);
		System.out.println(Caraudio.getCarvolLevel());
		Caraudio.volPause();
		System.out.println(Caraudio.getCarvolLevel());
		Caraudio.volResume();
		System.out.println(Caraudio.getCarvolLevel());
		Caraudio.setCarvolLevel(100);
		System.out.println(Caraudio.getCarvolLevel());
	}
}

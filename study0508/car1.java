package study0508;

public class car1 {
	//static 이라는 연산자가 있는경우
	static int speed;
	static String carName;
	public static void speedUp() {
		speed++;
		//speed+=5; 속도가 5씩 올라감
	}
	public static void speedDown() {
		speed--;
		if(speed<0) {
			stop();
		}
	}
	public static void stop() {
		speed = 0;
	}
	public static void main(String[] args) {
		carName = "소나타";
		speed = 100;
		//for( int i=1; i<=5; i++) { <for 반복문을 통해서 속도가 5씩 증가>
		speedUp(); // speed = 101;
	    // }
		speedUp(); // speed = 102;
		System.out.println("차이름: "+carName+", 속도: "+speed);
		stop();
		System.out.println("차이름: "+carName+", 속도: "+speed);
		
		carName = "그랜저";
		System.out.println("차이름: "+carName+", 속도: "+speed);
	}

}

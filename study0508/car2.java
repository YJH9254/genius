package study0508;

public class car2 {
	//static 연산자가 없는 경우
	int speed;   //속도
	String carName;   //차이름
	public void speedUp() {
		speed++;
	}
	public void speedDown() {
		speed--;
		if(speed<0) {
			stop();
		}
	}
	public void stop() {
		speed = 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car2 sonata = new car2();
		sonata.carName = "소나타";
		sonata.speed = 100;
		sonata.speedUp(); // 101
		sonata.speedUp(); // 102
		System.out.println("차이름: "+sonata.carName+" ,속도: "+sonata.speed);
		sonata.stop();
		System.out.println("차이름: "+sonata.carName+" ,속도: "+sonata.speed);
		
		car2 grandeur = new car2();
		grandeur.carName = "그랜저";
		grandeur.speed = 200;
		System.out.println("차이름: "+grandeur.carName+" ,속도: "+grandeur.speed);
	}

}

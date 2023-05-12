package study0508;

public class MyCar {
	
	int maxSpeed;
	String carName;
	String carColor;
	
	public MyCar(String carName, int maxSpeed) {
	this.carName=carName;
	this.maxSpeed=maxSpeed; }
	public MyCar(String carName, int maxSpeed, String carColor) {
		this.carName = carName;
		this.maxSpeed = maxSpeed;
		this.carColor = carColor; }
	public void maxSpeedUpdate(int speed) {
		this.maxSpeed+=speed;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCar car1 = new MyCar("소나타",230);
		MyCar car2 = new MyCar("그랜저",300,"white");
		System.out.println(car1.carName+":"+car1.maxSpeed);
		System.out.println(car2.carName+":"+car2.maxSpeed);
		car1.maxSpeedUpdate(-20); // 최고 속도의 가감
		System.out.println(car1.carName+":"+car1.maxSpeed);
	}
}

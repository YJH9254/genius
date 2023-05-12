package study0510;

public class CarVolMake implements CarVolService {
	private int CarvolLevel; // 변수
		private int Save; // 변수
	@Override
	public void volUp(int level) { // 메소드: level에 숫자를 넣으면 CarvolLevel이 +5가 된다.
		CarvolLevel += level;	
	}

	@Override
	public void volDown(int level) { // 메소드: level에 숫자를 넣으면 CarvolLevel이 넣은 숫자만큼 감소한다.
		CarvolLevel -= level;	
	}

	@Override
	public void volOff() {  // 메소드: volOff는 CarvolLevel = 0을 받아서 0이 된다
		CarvolLevel = 0;  // 
	}

	@Override
	public void volPause() {  // 메소드: CarvolLevel를 Save가 저장한다.
		Save = CarvolLevel; 
		CarvolLevel = 0;  
		
	}

	@Override
	public void volResume() {  // 메소드: Save의 값을 CarvolLevel 이 받고 Save=0이 된다.
		CarvolLevel = Save;  
		Save = 0;
	}
	public int getCarvolLevel () { // CarvolLevel 값을 받아온다.
		return CarvolLevel;  
	}
	public void setCarvolLevel(int level) {  // level에 값을 넣으면 CarvolLevel이 받아 값을 저장한다.
		this.CarvolLevel = level;  
	}
	}


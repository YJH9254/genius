package study0510;

public class CVM implements CVS {
	private int CarvolLevel;
		private int Save;
		
	public void volUp(int level) {
		CarvolLevel += level;
	}
	public void volDown(int level) {
		CarvolLevel -= level;
	}
	public void volOff() {
		CarvolLevel = 0;
	}
	public void volPause() {
		Save = CarvolLevel;
		Save = 0;
	}
	public void volResume() {
		CarvolLevel = Save;
		CarvolLevel = 0;
	}
	public int getCarvolLevel() {
		return getCarvolLevel();
	}
	public void setCarvolLevel(int CarvolLevel) {
		this.CarvolLevel = CarvolLevel;
	}
}

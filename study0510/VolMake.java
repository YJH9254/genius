package study0510;

public class VolMake implements VolService {
	private int VolLevel;
	public VolMake() {
		   VolLevel = (1);
	}

	public void volUp(int vol) {
		VolLevel += vol;
	}
	public void volDown(int vol) {
		VolLevel -= vol;
	}
	public int getVolLevel() {
		return VolLevel;
	}
	public void setVolLevel(int VolLevel) {
		this.VolLevel = VolLevel;
	}
	
}

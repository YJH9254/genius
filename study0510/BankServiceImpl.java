package study0510;

public class BankServiceImpl implements BankService {
	private int moneylevel;
	
	public void moneyInput(int money) {
		moneylevel+=money;
	}
	public void moneyouOutput(int money) {
		moneylevel-=money;
	}
	public void moneyprint() {
		moneylevel=0;
	}
	public int getmoneylevel() {
		return moneylevel;
	}
	public void setmoney(int money) {
		this.moneylevel=money;
	}
	
	}



package study0510;

public class BankMake {
	public static void main(String[] args) {
	BankServiceImpl mm = new BankServiceImpl();
	mm.moneyInput(500); 
	System.out.println(mm.getmoneylevel() );
	mm.moneyInput(2000);
	System.out.println(mm.getmoneylevel() );
	mm.moneyouOutput(1500);
	System.out.println(mm.getmoneylevel() );
	mm.setmoney(10000);
	System.out.println(mm.getmoneylevel() );
	}
}

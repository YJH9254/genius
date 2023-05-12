package study0510;

public class GoodsInfo {
	public int quantity;
	
	abstract public void quantityUp(int n);
	abstract public void quantityDown(int n);
	
	public void quantityZero() {
		quantity = 0;	
	}
}

public class apple extends fruit{
	private int vol;
	
	public apple(int val) {
		super(val);
	}
	
	public boolean makeAppleJuice(int val) {
		vol = val;
		return true;
	}

}

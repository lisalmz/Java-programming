// Mengzhu Luo Assignment OOP Number Guesser
import java.lang.Math;

public class NumberGuesser {
	protected int lowerBound;
	protected int upperBound;
	private int l = 1;
	private int u = 100;
	
	public NumberGuesser(int lowerBound,int upperBound) {
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
	}
	
	public void setLowerBound(int lowerBoundVal) {
		lowerBound = lowerBoundVal;
	}
	
	public int getLowerBound() {
		return lowerBound;
	}
	
	public void setUpperBound (int upperBoundVal) {
		upperBound = upperBoundVal;
	}
	
	public int getUpperBound() {
		return upperBound;
	}
	
	public void higher(int guess) {
		lowerBound = guess + 1;
	}
	
	public void lower(int guess) {
		upperBound = guess - 1;
	}
	
	public int getCurrentGuess() {
		return Math.round((lowerBound+upperBound)/2);
	}
	
	public void reset() {
		lowerBound = l;
		upperBound = u;
	}

}



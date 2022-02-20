// Mengzhu Luo Assignment OOP Number Guesser
import java.lang.Math;

public class NumberGuesser {
	private int lowerBound;
	private int upperBound;
	private int l = 1;
	private int u = 100;
	
	public void setLowerBound (int lowerBoundVal) {
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
	
	public void higher() {
		lowerBound = Math.round((lowerBound+upperBound)/2)+1;
	}
	
	public void lower() {
		upperBound = Math.round((lowerBound+upperBound)/2)-1;
	}
	
	public int getCurrentGuess() {
		return Math.round((lowerBound+upperBound)/2);
	}
	
	public void reset() {
		lowerBound = l;
		upperBound = u;
	}

}



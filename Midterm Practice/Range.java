public class Range {
	private int lower;
	private int upper;

	public void setLowerBound (int value){
		lower = value;
	}

	public int getLowerBound (){
		return lower;
	}

	public void setUpperBound (int value){
		upper = value;
	}

	public int getUpperBound (){
		return upper;
	}

	public boolean contains(int value) {
		return value >= lower && value <= upper;
	}

	public boolean equals(Range r) {
		return r.lower==lower && r.upper==upper;
	}
	
}
Q6
public class Range {
	private int lower;
	private int upper;

	public Range(){
		lower = 0;
		upper = 0;
	}

	public Range(int lower, int upper){
		this.lower = lower;
		this.upper = upper;
	}

	public int getUpperBound(){
		return upper;
	}

    public int getLowerBound(){
    	return lower;
    }

    public boolean contains(Range r){
    	return r.lower >= lower && r.upper <= upper;
    }

    public boolean equals(Range r){
    	return r.lower == lower && r.upper == upper;
    }
}

Range rrr = new Range(1, 2);
Range rr = new Range(2, 3);
rrr.contains(rr)
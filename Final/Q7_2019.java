Q7
public class MutableRange extends Range {
	
	

	public void setLowerBound(int value){
		lower = value;
	}

	public void setUpperBound(int value){
		upper = value;
	}

    // missing the step of expansion
	public int expandToContain(Range r){
		int oldLen = upper - lower;
		lower = Math.min(r.getLowerBound(),lower);
		upper = Math.max(r.getUpperBound(),upper);
		return upper-lower-oldLen;
	}

    // this is optional as the base class already defined its default constructor
	public MutableRange(){
		super();
	}

    // We can call super.Range(lower, upper) instead
	public MutableRange(int lower, int upper){
		super(lower, upper);
	}

	public MutableRange(Range r){
		lower = r.getLowerBound();
		upper = r.getUpperBound();
	}
}
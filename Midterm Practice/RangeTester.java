public class RangeTester {
	public static void main(String[]args){
		Range myFirstRange = new Range();

		myFirstRange.setLowerBound(1);
		myFirstRange.setUpperBound(3);


		Range mySecondRange = new Range();

		mySecondRange.setLowerBound(2);
		mySecondRange.setUpperBound(4);

		Range myThirdRange = new Range();

		myThirdRange.setLowerBound(3);
		myThirdRange.setUpperBound(5);

		int min = Math.min(myFirstRange.getLowerBound(), Math.min(mySecondRange.getLowerBound(), myThirdRange.getLowerBound());

		int max = Math.max(myFirstRange.getUpperBound(), Math.max(mySecondRange.getUpperBound(), myThirdRange.getUpperBound());

		System.out.println("The new range is ("+ min +","+max+")");


	}
}
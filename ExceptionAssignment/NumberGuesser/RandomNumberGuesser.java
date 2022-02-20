import java.util.Random;
public class RandomNumberGuesser extends NumberGuesser{
	public RandomNumberGuesser(int lowerBound, int upperBound) {
		super(lowerBound, upperBound);
	}

	@Override 
	public int getCurrentGuess() {
		Random randGen = new Random(15);
		return randGen.nextInt(upperBound-lowerBound+1)+lowerBound;
	}
}

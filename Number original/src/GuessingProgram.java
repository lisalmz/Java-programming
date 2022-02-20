// Mengzhu Luo Assignment OOP Number Guesser
import java.util.Scanner;

public class GuessingProgram {
	public static void main(String[] args) {
		NumberGuesser guesser = new NumberGuesser();
		guesser.setLowerBound(1);
		guesser.setUpperBound(100);	
		do {
				playOneGame(guesser);
		} while (shouldPlayAgain());
	}

	public static boolean shouldPlayAgain() {
		char playAgain;
		System.out.println("Do you want to play again? (y/n): ");
		Scanner input = new Scanner (System.in);
		playAgain = input.next().charAt(0);
		return playAgain == 'y';
	}
	
	public static char getUserResponseToGuess (int guess) {
		System.out.println("Is it " + guess + " (h/l/c)?: ");
		Scanner input = new Scanner (System.in);
		char answer = input.next().charAt(0);
		return answer;
	}
	
	public static void playOneGame (NumberGuesser guesser) {
		System.out.println("Think of a number from 1 to 100");
		int mid;
		char answer;
		do {
			mid = guesser.getCurrentGuess();
			answer = getUserResponseToGuess(mid);
			if (mid == 1 && answer == 'l') {
				System.out.println("You are cheating!");
                return;
			}
			if (mid == 100 && answer == 'h') {
				System.out.println("You are cheating!");
                return;
			}
			if (answer == 'h') {
				guesser.higher();
			} else if (answer == 'l') {
				guesser.lower();
			}
		} while (answer != 'c');
		System.out.println("You picked " + guesser.getCurrentGuess() +"? Great pick.");
		guesser.reset();
        return;
	}
}
		
	

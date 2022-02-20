//Mengzhu Luo
import java.util.Scanner;
import java.lang.Math;

public class Numberguess {

	
	public static void playOneGame () {	
		System.out.println("Guess a number from 1 to 100.");
		int low = 1;
		int high = 100;
		int mid;
		char answer;
		do {
			mid = getMidpoint(low, high);
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
				low = mid + 1;
			} else if (answer == 'l') {
				high = mid - 1;
			}
		} while (answer != 'c');
	}

	
	//This function should prompt the user with the phrase “is it <guess>? (h/l/c): “  with the value replacing the token <guess>. It should return a char. The char should be one of three possible values: ‘h’, ‘l’, or ‘c’. 
	public static char getUserResponseToGuess (int guess) {
		System.out.println("Is it " + guess + " (h/l/c)?: ");
		Scanner input = new Scanner (System.in);
		char answer = input.next().charAt(0);
		return answer;
	}

	//This function should accept two integers, and it should return the midpoint of the two integers. If there are two values in the middle of the range then you should consistently choose the smaller of the two. 
	public static int getMidpoint(int low, int high) {
		int mid = Math.round((low+high)/2);
		return mid;
	}

	public static boolean shouldPlayAgain() {
		char playAgain;
		System.out.println("Great! Do you want to play again? (y/n): ");
		Scanner input = new Scanner (System.in);
		playAgain = input.next().charAt(0);
		return playAgain == 'y';
	}
	
	public static void main(String[] args) {
		do {
				playOneGame();
		} while (shouldPlayAgain());
	}
}

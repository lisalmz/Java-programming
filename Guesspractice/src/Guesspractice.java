import java.util.Scanner;
import java.lang.Math;

public class Guesspractice {
	
	public static void playOneGame(){
		int midPoint;
		int low = 1;
		int high = 100;
		char Response;
		System.out.println("Guess a number from 1 to 100.");
		do {
			midPoint = getMidpoint(low,high);
			Response = getUserResponseToGuess(midPoint);
			if(midPoint==1 && Response!='c') {
				System.out.println("cheating");
				return;
			}
			if(midPoint==100 && Response!='c') {
				System.out.println("cheating");
				return;
			}
			if(Response == 'h') {
				low = midPoint+1;
			} else if (Response == 'l') {
				high = midPoint-1;
			}
		} while (Response != 'c');
		
	}
	public static char getUserResponseToGuess(int guess) {
		System.out.println("Is it" + guess +"(h/l/c)?:");
		Scanner input = new Scanner (System.in);
		char Response = input.next().charAt(0);
		return Response;
	}
	
	public static int getMidpoint(int low, int high) {
		int midPoint = Math.round((low+high)/2);
		return midPoint;
	}
	public static boolean shouldPlayAgain(){
		System.out.println("Great! Do you want to play again? (y/n): ");
		Scanner input = new Scanner (System.in);
		char answer = input.next().charAt(0);
		boolean playAgain = answer == 'y';
		return playAgain;
	}
	
	
	
	public static void main(String[] args) {


		do {

		playOneGame();

		} while (shouldPlayAgain());

		}

}

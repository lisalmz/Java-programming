package Game;
import java.util.*;
public class Blackjackpractice {
	public static void newGame () {
		Random random = new Random();        
        int a = random.nextInt(10)+1;
        int b = random.nextInt(10)+1;
        int total = a + b;
        char anotherCard;
        boolean hasNewRound = true;
        Scanner input = new Scanner (System.in);
        System.out.println("First cards: " + a + "," + b);
        System.out.println("Total: " + total);
        while (hasNewRound) {
        	if (total>21) { 
        		System.out.println("Bust");
        		hasNewRound = false;
        	} else if (total == 21) {
        		System.out.println("You win");
        		hasNewRound = false;
        	} else {
        		System.out.println("Do you want another card? (y/n): ");
        		anotherCard = input.next().charAt(0);
        		if (anotherCard == 'y') {
        			int c = random.nextInt(10)+1;
        			total = total + c;
        			System.out.println("Card: " + c);
        	        System.out.println("Total: " + total);
        		} else {
        			hasNewRound = false;
        		}
        	}
        }
       }
	
	public static void main (String[]args) {
		boolean continueToPlay = true;
		Scanner input = new Scanner (System.in);
		char playAgain;
		
		while(continueToPlay) {
			newGame();
			System.out.println("Would you like to play again? (y/n): ");
			playAgain = input.next().charAt(0);
			continueToPlay = playAgain == 'y';
	}
	}

}

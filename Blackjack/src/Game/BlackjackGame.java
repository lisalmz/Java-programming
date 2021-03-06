//Mengzhu Luo Blackjack assignment New Attempt
package Game;

import java.util.Random;
import java.util.Scanner;

public class BlackjackGame {
	
	
	public static void newGame() {
		System.out.println("New Game Started");
        Random random = new Random();
        Scanner input = new Scanner (System.in);
        int a = random.nextInt(10)+1;
        int b = random.nextInt(10)+1;
        char anotherCard;
        boolean hasNewRound = true;
        int total = a + b;
        System.out.println(String.format("Cards: %s %s, Total: %s", a, b, total));     
    	while (hasNewRound) {
			if (total > 21) {
				System.out.println("bust");
				hasNewRound = false;
			} else if (total == 21) {
				System.out.println("you win");
				hasNewRound = false;
			} else {
				System.out.println("Do you want another card?(y/n): ");
				anotherCard = input.next().charAt(0);
				if (anotherCard == 'y') {
					int c = random.nextInt(10)+1;
					System.out.println("Card: "+ c);
					total = total + c;
					System.out.println("Total: "+ total);
				} else {
					hasNewRound = false;
				}
			}
		}
        System.out.println("Game finished.");
	}
	
	public static void main(String args[]) {
		boolean continueToPlay = true;

        Scanner input = new Scanner (System.in);
        char playAgain;
        
		while (continueToPlay) {
			newGame();

    		System.out.println("Would you like to play again? (y/n): ");
    		playAgain = input.next().charAt(0);
    		continueToPlay = playAgain == 'y';
		}
		
	}
	
	
	public static void main_(String args[]) {

        Random random = new Random();        
        int a = random.nextInt(10)+1;
        int b = random.nextInt(10)+1;
        char anotherCard;
        char playAgain;
        Scanner input = new Scanner (System.in);
        
        System.out.println("First cards: "+a+", "+b);
        int total = a + b;
        System.out.println("Total: "+ total);
        while (true) {
        	if (total >= 21) {
        		if (total > 21) {
        			System.out.println("Bust.");
        		} else {
        			System.out.println("You win.");
        		}
        		System.out.println("Would you like to play again? (y/n): ");
        		playAgain = input.next().charAt(0);
        		if (playAgain == 'y') {
        			a = random.nextInt(10)+1;
        			b = random.nextInt(10)+1;
        			System.out.println("First cards: "+a+", "+b);
        			total = a + b;
        			System.out.println("Total: "+ total);
        		} else {
        			break;
        		}
        	}
        	else { 
        		System.out.println("Do you want another card?(y/n): ");
        		anotherCard = input.next().charAt(0);
        		if (anotherCard == 'y') {
        			int c = random.nextInt(10)+1;
        			System.out.println("Card: "+ c);
        			total = total + c;
        			System.out.println("Total: "+ total);
        		} else {
        			break;
        		}
        	}
        }
}
}

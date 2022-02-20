//Mengzhu Luo Blackjack assignment New Attempt
package Game;

import java.util.Random;
import java.util.Scanner;

public class BlackjackGameAgain {
	
	
	public static void newGame() {
      Random random = new Random();
      Scanner input = new Scanner (System.in);
      int a = random.nextInt(10)+1;
      int b = random.nextInt(10)+1;
      char anotherCard;
      boolean hasNewRound = true;
      int total = a + b;
      System.out.println(String.format("First Cards: %s, %s", a, b));  
      System.out.println(String.format("Total: %s", total));
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
}
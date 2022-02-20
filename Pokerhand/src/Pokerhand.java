// Mengzhu Luo Poker Hand Assignment
import java.util.Scanner;
import java.util.Arrays;
public class Pokerhand {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		int[] userVals = new int[5];
		int i;
		System.out.println("Enter five numeric cards, no face cards. Use 1 - 9.");
		for (i=0; i<5;i++) {		
			System.out.print("Card " +(i+1)+":");
			userVals[i] = input.nextInt();
		}
		Arrays.sort(userVals);
		// test for straight
		boolean isStraight = true;
        for (i=0; i<4; i++) {
        	if (userVals[i] != userVals[i+1] - 1) {
        		isStraight = false;
        		break;
        	}
        }
        if (isStraight) {
        	System.out.println("Straight!");
        	return;
        }
        // test for pair
        for (i=0; i<4; i++) {
        	if (userVals[i] == userVals[i+1]) {
        		System.out.println("Pair!");
        		return;
        	}
        }
        input.close();
	}
}

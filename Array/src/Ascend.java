//Write code that reads in an array of integers and prints "true" if the values are sorted in ascending order and "false" if they are not.//

import java.util.Scanner;

public class Ascend {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of integers");
        int n = input.nextInt();
		int[] userVals = new int[n];
		System.out.println("Enter a list of integers with the size just specified");
		for (int i=0; i < n; i++) {
			userVals[i] = input.nextInt();
		}
		for (int i=0; i < n-1; i++) {
			if (userVals[i]>userVals[i+1]) {
				System.out.println("false");
				return;
			}
		}
		System.out.println("true");
		input.close();
	}
}

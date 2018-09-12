/**
 * Name: Dakota Carpenter
 */

import java.util.Random;
import java.util.Scanner;

public class NumberGame implements StupidTextGame{
	
	public String getName() {
		return "Number Game";
	}
	
	public void play(Scanner console) {
		Random randGen = new Random();
		int num = randGen.nextInt(50) + 1;
		System.out.println("Your number was " + num);
		
		if (num % 2 == 0) {
			System.out.println("Your number is even, you win.");
		} else {
			System.out.println("Your number is odd, you lose.");
		}
	}
}

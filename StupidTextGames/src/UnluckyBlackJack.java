

import java.util.Random;
import java.util.Scanner;

public class UnluckyBlackJack implements StupidTextGame {

	public String getName() {
		return "Unlucky Black Jack";
	}
	
	public void play(Scanner console) {
		Random randGen = new Random();
		int cards = randGen.nextInt(21) + 8;
		System.out.println("Your current cards add up to " + cards + ". The dealer has 10.");
		System.out.println("Would you like to hit or stay?");
		System.out.println("1: hit \n2: stay");
		int choice = console.nextInt();
		if(choice==1) {
			System.out.println("You hit and bust. You lose.");
		}else {
			System.out.println("You stay and the dealer hits. They have 21. You lose.");
		}
	}

}


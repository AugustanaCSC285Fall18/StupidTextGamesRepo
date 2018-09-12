import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber implements StupidTextGame {

	public String getName() {
		return "Guess the Number";
	}

	public void play(Scanner console) {
		Random randGen = new Random();
		int num = randGen.nextInt(10) + 1;
		int choice = 0;
		int attemptNum = 1;
		boolean won = false;
		System.out.println("I'm thinking of a number from 1-10...\nYou get 3 attempts, good luck!");
		while (!won && attemptNum <= 3) {
			System.out.print("Attempt " + attemptNum + ": ");
			choice = console.nextInt();
			if (choice == num) {
				won = true;
			}
			attemptNum++;
		}
		if (won) {
			System.out.println("The number was 2! Congratulations, thanks for playing!");
		} else {
			System.out.println("Tough luck, better luck next time!\nThe number was:" + num);
		}
	}

}

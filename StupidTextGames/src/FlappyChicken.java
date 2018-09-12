

/**
 * 
 * @author tuantruong17
 *
 */

import java.util.Random;
import java.util.Scanner;

public class FlappyChicken implements StupidTextGame{
	public String getName() {
		return "Flappy Chicken";
	}
	
	public void play(Scanner console) {
		Random randGen = new Random();
		String[] message = new String[2];
		message[0] = " and landed on the ground";
		message[1] = " and crashed into the pipe";
		int howToDie = randGen.nextInt(2);
		System.out.println("The chicken flapped " + (randGen.nextInt(20) + 10) + " times" + message[howToDie]);
		System.out.println("You lose.");
	}
}
